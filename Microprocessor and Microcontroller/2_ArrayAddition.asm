input macro
mov ah,01h
int 21h
endm
output macro
mov ah,02h
int 21h
endm
disp macro var
lea dx,var
mov ah,09h
int 21h
endm

.model small
.Stack 100H
.data
msg1 db 10,"Assignment 1 Array Addition$"
msg2 db 10,"SYITB96 Viraj Balasaheb Patil$"
ipmsg1 db 10,"Enter size of Array :$"
ipmsg2 db 10,"Enter Numbers :$"
opmsg db 10,"Addition =$"

arr db 10 dup(0)
count db 0

.code
mov ax,@data
mov ds,ax
disp msg1
disp msg2

lea si,arr
disp ipmsg1
input
sub al,30h

mov count,al
mov cl,count

s1: disp ipmsg2         
    input
    sub al,30h
    mov [si],al
    inc si
    loop s1

mov ax,0000h
mov cl,count
disp opmsg
lea si,arr
s2: add al,[si]
    inc si
    loop s2

mov ch,02h
mov cl,04h
mov bl,al

s3: rol bl,cl
    mov dl,bl
    and dl,0fh
    cmp dl,09   ; dl=dl-09
    jbe s4
    add dl,07

s4:add dl,30h

   output
   dec ch
   jnz s3

   mov ah,4ch
   end
