f [] = 0
f (x:xs) = if x `mod` 2 /= 0 then x + f xs else f xs 

main = do
   inputdata <- getContents
   putStrLn $ show $ f $ map (read :: String -> Int) $ lines inputdata
