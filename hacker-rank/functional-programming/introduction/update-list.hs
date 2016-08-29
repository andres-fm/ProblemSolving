f [] = []
f (x:xs) = if x >= 0 then x:f xs else (-x):f xs

main = do
   inputdata <- getContents
   mapM_ putStrLn $ map show $ f $ map (read :: String -> Int) $ lines inputdata
