mingling :: String -> String -> String
mingling [] [] = []
mingling (x:xs) (y:ys) = x:y:mingling xs ys

main = do
        pawel <- getLine
        shaka <- getLine
        putStr (mingling pawel shaka)
