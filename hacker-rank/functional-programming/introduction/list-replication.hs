f :: Int -> [Int] -> [Int]
f n [] = []
f n (x:xs) = (replicate n x) ++ f n xs

main :: IO ()
main = getContents >>=
       mapM_ print. (\(n:arr) -> f n arr). map read. words
