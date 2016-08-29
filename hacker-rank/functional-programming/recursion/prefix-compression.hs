prefix :: String -> String -> String
prefix [] _ = []
prefix _ [] = []
prefix (x:xs) (y:ys) 
                    | x == y = x:(prefix xs ys) 
                    | otherwise = []
                    
x'y' :: String -> String -> [String]
x'y' [] [] = [[], []]
x'y' (x:xs) [] = [(x:xs), []]
x'y' [] (x:xs) = [[], (x:xs)]
x'y' (x:xs) (y:ys)
                | x /= y = [(x:xs), (y:ys)]
                | otherwise = x'y' xs ys

main = do x <- getLine
          y <- getLine
          let p = prefix x y
              arrxy = x'y' x y
          putStrLn(show(length(p)) ++ " " ++ p) 
          putStrLn(show(length(arrxy!!0)) ++ " " ++ arrxy!!0)
          putStrLn(show(length(arrxy!!1)) ++ " " ++ arrxy!!1)
          
          
