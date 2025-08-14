key="github"
message="cmejink bh abjxbr kuz jmo jbbrtxuaf!"
a=ord("a")
ans=""
n=0
for i in range(len(message)):
    if not message[i].isalpha():
        ans=ans+message[i]
    else:
        letter=((ord(message[i])-a)-(ord(key[n%len(key)])-a))%26
        ans+=chr(letter+a)
        n+=1
print(ans)
        