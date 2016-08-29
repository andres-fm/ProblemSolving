f :: [Int] -> [Int]
f [] = []
f [x] = []
f (x:y:ys) = y:f ys

main = do
   inputdata <- getContents
   mapM_ (putStrLn. show). f. map read. lines $ inputdata

