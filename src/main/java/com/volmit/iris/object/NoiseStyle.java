package com.volmit.iris.object;

import com.volmit.iris.noise.CNG;
import com.volmit.iris.noise.CNGFactory;
import com.volmit.iris.noise.NoiseType;
import com.volmit.iris.util.Desc;
import com.volmit.iris.util.DontObfuscate;
import com.volmit.iris.util.RNG;

@Desc("Styles of noise")
@DontObfuscate
public enum NoiseStyle {
	@Desc("White Noise is like static. Useful for block scattering but not terrain.")
	@DontObfuscate
	STATIC(rng -> new CNG(rng, NoiseType.WHITE, 1D, 1)),

	@Desc("White Noise is like static. Useful for block scattering but not terrain. 4 Times finer.")
	@DontObfuscate
	STATIC_FINE(rng -> new CNG(rng, NoiseType.WHITE, 1D, 1).scale(4)),

	@Desc("White Noise is like static. Useful for block scattering but not terrain. 16 Times finer.")
	@DontObfuscate
	STATIC_ULTRA_FINE(rng -> new CNG(rng, NoiseType.WHITE, 1D, 1).scale(16)),

	@Desc("Wispy Perlin-looking simplex noise. The 'iris' style noise.")
	@DontObfuscate
	IRIS(rng -> CNG.signature(rng).scale(1)),

	@Desc("Wispy Perlin-looking simplex noise. The 'iris' style noise.")
	@DontObfuscate
	IRIS_DOUBLE(rng -> CNG.signatureDouble(rng).scale(1)),

	@Desc("Wispy Perlin-looking simplex noise. The 'iris' style noise.")
	@DontObfuscate
	IRIS_THICK(rng -> CNG.signatureThick(rng).scale(1)),

	@Desc("Wispy Perlin-looking simplex noise. The 'iris' style noise.")
	@DontObfuscate
	IRIS_HALF(rng -> CNG.signatureHalf(rng).scale(1)),

	@Desc("Basic, Smooth & Fast Simplex noise.")
	@DontObfuscate
	SIMPLEX(rng -> new CNG(rng, 1D, 1).scale(1)),

	@Desc("Billow Fractal Simplex Noise. Single octave.")
	@DontObfuscate
	FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 1)),

	@Desc("FBM Fractal Simplex Noise. Single octave.")
	@DontObfuscate
	FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 1)),

	@Desc("Billow Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_BILLOW_IRIS(rng -> CNG.signature(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX)),

	@Desc("FBM Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_FBM_IRIS(rng -> CNG.signature(rng, NoiseType.FRACTAL_FBM_SIMPLEX)),

	@Desc("Billow Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_BILLOW_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX)),

	@Desc("FBM Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_FBM_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.FRACTAL_FBM_SIMPLEX)),

	@Desc("Billow Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_BILLOW_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX)),

	@Desc("FBM Fractal Iris Noise. Single octave.")
	@DontObfuscate
	FRACTAL_FBM_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.FRACTAL_FBM_SIMPLEX)),

	@Desc("Rigid Multi Fractal Simplex Noise. Single octave.")
	@DontObfuscate
	FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 1)),

	@Desc("Billow Fractal Simplex Noise. 2 octaves.")
	@DontObfuscate
	BIOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 2)),

	@Desc("FBM Fractal Simplex Noise. 2 octaves.")
	@DontObfuscate
	BIOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 2)),

	@Desc("Rigid Multi Fractal Simplex Noise. 2 octaves.")
	@DontObfuscate
	BIOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 2)),

	@Desc("Rigid Multi Fractal Simplex Noise. 3 octaves.")
	@DontObfuscate
	TRIOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 3)),

	@Desc("Billow Fractal Simplex Noise. 3 octaves.")
	@DontObfuscate
	TRIOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 3)),

	@Desc("FBM Fractal Simplex Noise. 3 octaves.")
	@DontObfuscate
	TRIOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 3)),

	@Desc("Rigid Multi Fractal Simplex Noise. 4 octaves.")
	@DontObfuscate
	QUADOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 4)),

	@Desc("Billow Fractal Simplex Noise. 4 octaves.")
	@DontObfuscate
	QUADOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 4)),

	@Desc("FBM Fractal Simplex Noise. 4 octaves.")
	@DontObfuscate
	QUADOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 4)),

	@Desc("Rigid Multi Fractal Simplex Noise. 5 octaves.")
	@DontObfuscate
	QUINTOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 5)),

	@Desc("Billow Fractal Simplex Noise. 5 octaves.")
	@DontObfuscate
	QUINTOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 5)),

	@Desc("FBM Fractal Simplex Noise. 5 octaves.")
	@DontObfuscate
	QUINTOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 5)),

	@Desc("Rigid Multi Fractal Simplex Noise. 6 octaves.")
	@DontObfuscate
	SEXOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 6)),

	@Desc("Billow Fractal Simplex Noise. 6 octaves.")
	@DontObfuscate
	SEXOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 6)),

	@Desc("FBM Fractal Simplex Noise. 6 octaves.")
	@DontObfuscate
	SEXOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 6)),

	@Desc("Rigid Multi Fractal Simplex Noise. 7 octaves.")
	@DontObfuscate
	SEPTOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 7)),

	@Desc("Billow Fractal Simplex Noise. 7 octaves.")
	@DontObfuscate
	SEPTOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 7)),

	@Desc("FBM Fractal Simplex Noise. 7 octaves.")
	@DontObfuscate
	SEPTOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 7)),

	@Desc("Rigid Multi Fractal Simplex Noise. 8 octaves.")
	@DontObfuscate
	OCTOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 8)),

	@Desc("Billow Fractal Simplex Noise. 8 octaves.")
	@DontObfuscate
	OCTOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 8)),

	@Desc("FBM Fractal Simplex Noise. 8 octaves.")
	@DontObfuscate
	OCTOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 8)),

	@Desc("Rigid Multi Fractal Simplex Noise. 9 octaves.")
	@DontObfuscate
	NONOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 9)),

	@Desc("Billow Fractal Simplex Noise. 9 octaves.")
	@DontObfuscate
	NONOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 9)),

	@Desc("FBM Fractal Simplex Noise. 9 octaves.")
	@DontObfuscate
	NONOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 9)),

	@Desc("Rigid Multi Fractal Simplex Noise. 10 octaves.")
	@DontObfuscate
	VIGOCTAVE_FRACTAL_RM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_RIGID_MULTI_SIMPLEX, 1D, 10)),

	@Desc("Billow Fractal Simplex Noise. 10 octaves.")
	@DontObfuscate
	VIGOCTAVE_FRACTAL_BILLOW_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_BILLOW_SIMPLEX, 1D, 10)),

	@Desc("FBM Fractal Simplex Noise. 10 octaves.")
	@DontObfuscate
	VIGOCTAVE_FRACTAL_FBM_SIMPLEX(rng -> new CNG(rng, NoiseType.FRACTAL_FBM_SIMPLEX, 1D, 10)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 2 octaves")
	@DontObfuscate
	BIOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 2).scale(1D / 2D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 3 octaves")
	@DontObfuscate
	TRIOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 3).scale(1D / 3D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 4 octaves")
	@DontObfuscate
	QUADOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 4).scale(1D / 4D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 5 octaves")
	@DontObfuscate
	QUINTOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 5).scale(1D / 5D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 6 octaves")
	@DontObfuscate
	SEXOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 6).scale(1D / 6D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 7 octaves")
	@DontObfuscate
	SEPTOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 7).scale(1D / 12D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 8 octaves")
	@DontObfuscate
	OCTOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 8).scale(1D / 25D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 9 octaves")
	@DontObfuscate
	NONOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 9).scale(1D / 50D)),

	@Desc("Basic, Smooth & Fast Simplex noise. Uses 10 octaves")
	@DontObfuscate
	VIGOCTAVE_SIMPLEX(rng -> new CNG(rng, 1D, 10).scale(1D / 100D)),

	@Desc("Glob noise is like cellular, but with globs...")
	@DontObfuscate
	GLOB(rng -> new CNG(rng, NoiseType.GLOB, 1D, 1)),

	@Desc("Glob noise is like cellular, but with globs...")
	@DontObfuscate
	GLOB_IRIS(rng -> CNG.signature(rng, NoiseType.GLOB)),

	@Desc("Glob noise is like cellular, but with globs...")
	@DontObfuscate
	GLOB_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.GLOB)),

	@Desc("Glob noise is like cellular, but with globs...")
	@DontObfuscate
	GLOB_IRIS_DOUBLE(rng -> CNG.signatureDouble(rng, NoiseType.GLOB)),

	@Desc("Glob noise is like cellular, but with globs...")
	@DontObfuscate
	GLOB_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.GLOB)),

	@Desc("Cubic Noise")
	@DontObfuscate
	LAVALAMP(rng -> new CNG(rng, NoiseType.CUBIC, 1D, 1).scale(256)),

	@Desc("Cubic Noise")
	@DontObfuscate
	LAVALAMP_IRIS(rng -> CNG.signature(rng, NoiseType.CUBIC).scale(256)),

	@Desc("Cubic Noise")
	@DontObfuscate
	LAVALAMP_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.CUBIC).scale(256)),

	@Desc("Cubic Noise")
	@DontObfuscate
	LAVALAMP_IRIS_DOUBLE(rng -> CNG.signatureDouble(rng, NoiseType.CUBIC).scale(256)),

	@Desc("Cubic Noise")
	@DontObfuscate
	LAVALAMP_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.CUBIC).scale(256)),

	@Desc("Cellular noise creates the same noise level for cells, changes noise level on cell borders.")
	@DontObfuscate
	CELLULAR(rng -> new CNG(rng, NoiseType.CELLULAR, 1D, 1)),

	@Desc("Cellular noise creates the same noise level for cells, changes noise level on cell borders. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	CELLULAR_IRIS(rng -> CNG.signature(rng, NoiseType.CELLULAR)),

	@Desc("Cellular noise creates the same noise level for cells, changes noise level on cell borders. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	CELLULAR_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.CELLULAR)),

	@Desc("Cellular noise creates the same noise level for cells, changes noise level on cell borders. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	CELLULAR_IRIS_DOUBLE(rng -> CNG.signatureDouble(rng, NoiseType.CELLULAR)),

	@Desc("Cellular noise creates the same noise level for cells, changes noise level on cell borders. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	CELLULAR_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.CELLULAR)),

	@Desc("Inverse of vascular, height gets to 1.0 as it approaches the center of a cell")
	@DontObfuscate
	CELLULAR_HEIGHT(rng -> new CNG(rng, NoiseType.CELLULAR_HEIGHT, 1D, 1)),

	@Desc("Inverse of vascular, height gets to 1.0 as it approaches the center of a cell, using the iris style.")
	@DontObfuscate
	CELLULAR_HEIGHT_IRIS(rng -> CNG.signature(rng, NoiseType.CELLULAR_HEIGHT)),

	@Desc("Inverse of vascular, height gets to 1.0 as it approaches the center of a cell, using the iris style.")
	@DontObfuscate
	CELLULAR_HEIGHT_IRIS_DOUBLE(rng -> CNG.signatureDouble(rng, NoiseType.CELLULAR_HEIGHT)),

	@Desc("Inverse of vascular, height gets to 1.0 as it approaches the center of a cell, using the iris style.")
	@DontObfuscate
	CELLULAR_HEIGHT_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.CELLULAR_HEIGHT)),

	@Desc("Inverse of vascular, height gets to 1.0 as it approaches the center of a cell, using the iris style.")
	@DontObfuscate
	CELLULAR_HEIGHT_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.CELLULAR_HEIGHT)),

	@Desc("Vascular noise gets higher as the position nears a cell border.")
	@DontObfuscate
	VASCULAR(rng -> new CNG(rng, NoiseType.VASCULAR, 1D, 1)),

	@Desc("Vascular noise gets higher as the position nears a cell border. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	VASCULAR_IRIS(rng -> CNG.signature(rng, NoiseType.VASCULAR)),

	@Desc("Vascular noise gets higher as the position nears a cell border. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	VASCULAR_IRIS_DOUBLE(rng -> CNG.signatureDouble(rng, NoiseType.VASCULAR)),

	@Desc("Vascular noise gets higher as the position nears a cell border. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	VASCULAR_IRIS_THICK(rng -> CNG.signatureThick(rng, NoiseType.VASCULAR)),

	@Desc("Vascular noise gets higher as the position nears a cell border. Cells are distorted using Iris styled wispy noise.")
	@DontObfuscate
	VASCULAR_IRIS_HALF(rng -> CNG.signatureHalf(rng, NoiseType.VASCULAR)),

	;
	private CNGFactory f;

	private NoiseStyle(CNGFactory f) {
		this.f = f;
	}

	public CNG create(RNG seed) {
		return f.create(seed).bake();
	}
}
