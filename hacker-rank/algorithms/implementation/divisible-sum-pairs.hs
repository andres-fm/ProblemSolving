import Control.Applicative
import Control.Monad
import System.IO


main :: IO ()
main = do
    n_temp <- getLine
    let n_t = words n_temp
    let n = read $ n_t!!0 :: Int
    let k = read $ n_t!!1 :: Int
    a_temp <- getLine
    let a = map read $ words a_temp :: [Int]
    print(sum([ 1 | i <- [0..n-2], j <- [i+1..n-1], ((a!!i + a!!j) `mod` k) == 0]))
