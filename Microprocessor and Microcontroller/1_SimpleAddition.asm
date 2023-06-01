.model small
.stack 100h
.data
arr db 11h,12h,03h,10h,21h
sum db 0
.code
mov ax,@data
mov ds,ax
mov bx,offset arr
mov ax,00H
mov cl,05h
repeat: add al,[bx]
inc bx
dec cl
jnz repeat
mov sum,al
mov dl,sum
int 3
End
