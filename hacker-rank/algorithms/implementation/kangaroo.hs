import Control.Applicative
import Control.Monad
import System.IO

main :: IO ()
main = do
    x1_temp <- getLine
    let x1_t = words x1_temp
    let x1 = read $ x1_t!!0 :: Int
    let v1 = read $ x1_t!!1 :: Int
    let x2 = read $ x1_t!!2 :: Int
    let v2 = read $ x1_t!!3 :: Int
    if v1 > v2 && (((x2-x1) `mod`(v1-v2)) == 0) then putStr "YES" else putStr "NO"
