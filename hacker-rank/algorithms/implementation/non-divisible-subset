count :: Int -> Int -> [Int] -> Int
count _ _ [] = 0
count nmod k (x:xs) = if ((x `mod` k) == nmod) then 1 + count nmod k xs else 0 + count nmod k xs
 
buckets :: Int -> Int -> [Int] -> [Int]
buckets (-1) _ _ = []
buckets nmod k numbers = (count nmod k numbers):(buckets (nmod-1) k numbers)

sum_right :: Int -> [Int] -> [Int]
sum_right k (m:ms)
                  | k `mod` 2 == 0 = sumSubset ((k-1)`div` 2) (m:ms)
                  | otherwise = sumSubset (k `div` 2) (m:ms)

sum_left :: Int -> [Int] -> [Int]
sum_left k (m:o:os) 
                   | k `mod` 2 == 0 = sumSubset ((k-1)`div` 2) (o:os)
                   | otherwise = sumSubset (k `div` 2) (o:os)

sumSubset :: Int -> [Int] -> [Int]
sumSubset 0 _ = []
sumSubset iterations (x:xs) = x:(sumSubset (iterations-1) xs)

biggestSum :: [Int] -> [Int] -> Int
biggestSum [] [] = 0
biggestSum (x:xs) (y:ys) = if x > y then x + biggestSum xs ys else y + biggestSum xs ys

finalAnswer :: [Int] -> Int -> Int -> Int
finalAnswer modules subset k 
                            | (mod k 2 == 0) &&  modules!!0 >= 1 && modules!!(div k 2) >= 1 = subset + 2
                            | modules!!0 >= 1 = subset + 1
                            | (mod k 2 == 0) && modules!!(div k 2) >= 1 = subset + 1
                            | otherwise = subset

main = do n_ktemp <- getLine
          num <- getLine
          let n_k = map read $ words n_ktemp :: [Int]
              n = n_k!!0
              k = n_k!!1
          if k == 1 
                then print 1 
                else do
                    let numbers = map read $ words num :: [Int]
                        bucket_right = (buckets (k-1) k numbers)
                        bucket_left = reverse (bucket_right)
                        right = sum_right k bucket_right
                        left = sum_left k bucket_left
                        subset = biggestSum right left
                    print (finalAnswer bucket_left subset k)
          
          
          
