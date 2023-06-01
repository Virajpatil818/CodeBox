.model small
disp macro msg
mov ah,09h
lea dx,msg
int 21h
endm
;-------------end of the macro----------------------------------------
.stack 100h
.data

msg1 db 10,13, '*****MENU*****$'
msg2 db 10,13, '1:HEX TO BCD $'
msg3 db 10,13, '2:BCD TO HEX $'
msg31 db 10,13,'3:EXIT $'
msg4 db 10,13, 'Enter your choice :: $'
msg5 db 10,13, 'Enter 4 digit hex number :: $'
msg6 db 10,13, 'Equivalent bcd number is :: $'
msg7 db 10,13, 'Enter 5 digit bcd number :: $'
msg8 db 10,13, 'Equivalent hex number is ::$'
msg9 db 10,13, 'Invalid entry!!!$'
op db 10 dup(?)
.code
main: mov ax,@data
mov ds,ax
;-------------------------------------------------------------------
menu: disp msg1 ;call macro disp to display menu
disp msg2 ;display msg hex to bcd
disp msg3 ;display msg bcd to hex
disp msg31 ;exit
disp msg4
mov ah,01h ; read single digit-choice from user
int 21h
cmp al,31h ;compare choice accepted from user with 31=1
je hex ;jump to proc hex-if equal (je)
cmp al,32h
je bcd

cmp al,33h
je exit
disp msg9
jmp menu
;-------------hex messages--------------
hex: disp msg5 ;call macro disp-enter 4 digit hex n0
call input ;call inputp proc for hex -to accept 4 digit no from user
disp msg6 ;call macro disp
call hexp ;call hex procedure
jmp menu ;jump to menu
;-------bcd------------------------------------
bcd: disp msg7
call inp1
call bcdp ;call bcd proc
disp msg8
call disp1
jmp menu
;------------------exit---------------------
exit: mov ah,4ch
int 21h
;---------------------------------input proc to accept 4 digit hex no from user--------
input proc
mov cx,0404h ;load counter with 4 digit for hex val ->ch=04, cl=04
mov ax,0000h ;initialization
mov bx,0000h
in1: mov ah,01h ;read single digits/val- in loop
int 21h
cmp al,30h ;if below than zero -disp invalid(0=30)
jb invalid ;jump if below- call invalid proc
cmp al,39h
jg a1 ;jump to a1 if greator than 39-or-9
sub al,30h ;ASCII conversion
jmp insert
a1: cmp al,41h ;check with hex-alphabet A
jb invalid
cmp al,46h ;check with hex F
jg a2 ;jump to a2 if greator than F
sub al,37h ;if letter accepted in Uppercase sub 37
jmp insert
a2: cmp al,61h ;check lowercase a

jb invalid
cmp al,66h ;check lowercase f
jg invalid
sub al,57h ;subtract 57 if letter is lowercase
jmp insert
insert:
shl bx,cl ;shift logical left-pack 4 binary digits as 16 bit no
add bl,al ;pack 4 binary digits as 16 bit no
dec ch ;dec counter
jnz in1 ;jump if not zero to in1
ret
;--------- if invalid choice--------------------------
invalid:
disp msg9
jmp menu
input endp ;end of the proc inputp
;------------hex proc starts from here---------------------------------------------------------
hexp proc
mov ax,bx
mov bx,0ah ;load decimal 0010 in bx for division
mov cl,00;clear counter
b1: mov dx,00h ;clear dx
div bx ;div by 10 & store the result in DX:AX
push dx ;save reminder
inc cx ;counter reminder
cmp ax,00h ;compare if quotient =zero
jne b1 ;jump again b1-if not equal to zero
b2: pop dx ;get reminder by pop to display
add dl,30h ;convert to ASCII if digit
mov ah,02h ;display digit
int 21h
dec cl ;decrese counter val
jnz b2 ;jump to loop b2 if not zero
ret
hexp endp

;---------------------input proc to accept bcd no--------------------
inp1 proc
lea si,op
mov cl,05;initialise counter to accept 5 digit-bcd no
c1:
mov ah,01h
int 21h
cmp al,30h ;compare choice if below 0
jb invalid1
cmp al,39h ;compare choice if greator than 9
jg invalid1
sub al,30h ;ASCII conversion
mov [si],al ;mov read val from al to source index
inc si
dec cl ;decrese counter cl
jnz c1 ; jump to loop c1 if not zero
ret
invalid1:
disp msg9
c2: ret
inp1 endp
;------------------bcd procedure strats here--------------------------------
bcdp proc
mov bx,0000h
mov cx,0000h
mov dx,0000h
lea si,op
mov ax,2710h ;decimal 10000
mov bl,[si]
mul bx
add cx,ax
inc si
mov ax,3E8h ;decimal 1000
mov bl,[si]
mul bx
add cx,ax

inc si
mov ax,64h ;decimal 100
mov bl,[si]
mul bx
add cx,ax
inc si
mov ax,0ah ;decimal 10
mov bl,[si]
mul bx
add cx,ax
inc si
mov ax,1 ;mov one
mov bl,[si]
mul bx
add cx,ax;store addition result in CX
ret
bcdp endp
;-------------------------------------display code to display 4 digit HEX no-------------
disp1 proc
mov dx,0000h
mov bx,cx ;mov result cx to bx
mov cl,04h ;Load rotate count
mov ch,04h ;Load digit count->digits to be displayed

d2: rol bx,cl
mov dx,00h
mov dl,bl
and dl,0fh ;mask higher nibble and get only lsb
cmp dl,09h ;compare if digit or alphabet
jbe d1
add dl,07h ;f letter add 37
d1: add dl,30h ;if digit add 30
mov ah,02h ;dos function to-display output
int 21h ;interrupt 21h
inc si
dec ch

jnz d2
ret
disp1 endp
end
;---------------------
