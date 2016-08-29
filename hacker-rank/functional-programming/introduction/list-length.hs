len :: [a] -> Int
len [x] = 1 
len (x:xs) = 1 + len xs 
