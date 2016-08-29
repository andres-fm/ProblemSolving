solve :: Double -> Double
solve x = real x 9 

real :: Double -> Int -> Double
real x 0 = 1
real x n = ((x**fromIntegral n)/(factorial n)) + real x (n-1)

factorial :: Int -> Double
factorial 0 = 1
factorial n = (fromIntegral n) * factorial (n-1)

main :: IO ()
main = getContents >>= mapM_ print. map solve. map (read::String->Double). tail. words
