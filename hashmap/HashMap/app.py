m = [[1,2,3],[4,5,6],[7,8,9]]
for i in range(len(m)):
    for j in range(len(m[0])):
        t = m[i][j]
        #print(t)
        m[i][j] = m[j][i]
        #print(m[i][j])
        m[j][i] = t
        #print(m[j][i])
    break
print(m)