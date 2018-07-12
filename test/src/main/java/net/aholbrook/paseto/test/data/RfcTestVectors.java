/*
Copyright 2018 Andrew Holbrook

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package net.aholbrook.paseto.test.data;

public class RfcTestVectors {
	private static short[] RFC_TEST_KEY = new short[] {
			0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7a, 0x7b, 0x7c, 0x7d, 0x7e, 0x7f,
			0x80, 0x81, 0x82, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x8a, 0x8b, 0x8c, 0x8d, 0x8e, 0x8f
	};

	private static short[] RFC_TEST_NONCE_1 = new short[] {
			0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
			0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
	};

	private static short[] RFC_TEST_NONCE_V1 = new short[] {
			0x26, 0xf7, 0x55, 0x33, 0x54, 0x48, 0x2a, 0x1d, 0x91, 0xd4, 0x78, 0x46, 0x27, 0x85, 0x4b, 0x8d,
			0xa6, 0xb8, 0x04, 0x2a, 0x79, 0x66, 0x52, 0x3c, 0x2b, 0x40, 0x4e, 0x8d, 0xbb, 0xe7, 0xf7, 0xf2
	};

	private static short[] RFC_TEST_NONCE_V2 = new short[] {
			0x45, 0x74, 0x2c, 0x97, 0x6d, 0x68, 0x4f, 0xf8, 0x4e, 0xbd, 0xc0, 0xde,
			0x59, 0x80, 0x9a, 0x97, 0xcd, 0xa2, 0xf6, 0x4c, 0x84, 0xfd, 0xa1, 0x9b
	};

	private static short[] RFC_TEST_SK = new short[] {
			0xb4, 0xcb, 0xfb, 0x43, 0xdf, 0x4c, 0xe2, 0x10, 0x72, 0x7d, 0x95, 0x3e, 0x4a, 0x71, 0x33, 0x07,
			0xfa, 0x19, 0xbb, 0x7d, 0x9f, 0x85, 0x04, 0x14, 0x38, 0xd9, 0xe1, 0x1b, 0x94, 0x2a, 0x37, 0x74,
			0x1e, 0xb9, 0xdb, 0xbb, 0xbc, 0x04, 0x7c, 0x03, 0xfd, 0x70, 0x60, 0x4e, 0x00, 0x71, 0xf0, 0x98,
			0x7e, 0x16, 0xb2, 0x8b, 0x75, 0x72, 0x25, 0xc1, 0x1f, 0x00, 0x41, 0x5d, 0x0e, 0x20, 0xb1, 0xa2
	};

	private static short[] RFC_TEST_PK = new short[] {
			0x1e, 0xb9, 0xdb, 0xbb, 0xbc, 0x04, 0x7c, 0x03, 0xfd, 0x70, 0x60, 0x4e, 0x00, 0x71, 0xf0, 0x98,
			0x7e, 0x16, 0xb2, 0x8b, 0x75, 0x72, 0x25, 0xc1, 0x1f, 0x00, 0x41, 0x5d, 0x0e, 0x20, 0xb1, 0xa2
	};

	private static short[] RFC_TEST_RSA_PRIVATE_KEY = new short[] {
			0x30, 0x82, 0x04, 0xBD, 0x02, 0x01, 0x00, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7,
			0x0D, 0x01, 0x01, 0x01, 0x05, 0x00, 0x04, 0x82, 0x04, 0xA7, 0x30, 0x82, 0x04, 0xA3, 0x02, 0x01,
			0x00, 0x02, 0x82, 0x01, 0x01, 0x00, 0xC9, 0xA4, 0xE0, 0x4E, 0xDE, 0x77, 0xA6, 0x1D, 0xE9, 0xE4,
			0x61, 0xE0, 0xC2, 0x81, 0x96, 0xC3, 0x3E, 0x61, 0x45, 0xF5, 0x97, 0x49, 0x00, 0x34, 0xF0, 0xD0,
			0x8E, 0xC1, 0xED, 0x05, 0x12, 0x00, 0x0B, 0x5A, 0x8B, 0x3D, 0x18, 0x28, 0xCD, 0x14, 0x27, 0x7B,
			0xDB, 0x79, 0xC2, 0x1F, 0x10, 0x6D, 0x37, 0x5A, 0x9D, 0xEF, 0x83, 0x12, 0x87, 0xFB, 0x8D, 0xF3,
			0xC2, 0x4F, 0x21, 0xBC, 0x31, 0x2A, 0x17, 0x83, 0xA7, 0x89, 0x31, 0xA3, 0x86, 0x0C, 0x37, 0x9B,
			0x6B, 0x3D, 0xA1, 0x74, 0x7B, 0xD1, 0xBA, 0x06, 0x3D, 0x4D, 0xD3, 0x61, 0xE7, 0x6A, 0x7C, 0x45,
			0x2D, 0x6F, 0xA0, 0x98, 0xB6, 0xE0, 0x60, 0xEF, 0xD2, 0x65, 0x87, 0xD6, 0x17, 0xF3, 0x3C, 0xC8,
			0xB0, 0x5C, 0xBB, 0x96, 0x35, 0x3A, 0xDD, 0x19, 0xC4, 0x30, 0xC3, 0x5D, 0x2F, 0x70, 0x21, 0x04,
			0xED, 0x04, 0x4D, 0x27, 0x7B, 0x76, 0x1B, 0xC6, 0x06, 0x49, 0x01, 0x94, 0xD4, 0xE5, 0x7A, 0xB2,
			0x43, 0x50, 0xF1, 0x77, 0x36, 0x32, 0x0B, 0x99, 0x45, 0xEB, 0x20, 0x5A, 0x47, 0x95, 0x10, 0xB4,
			0x26, 0x13, 0x9D, 0x70, 0x00, 0xA5, 0x54, 0x6E, 0x50, 0x8D, 0x92, 0x77, 0xA2, 0xF5, 0x13, 0x6B,
			0xE5, 0xF5, 0xB4, 0x81, 0xBA, 0x66, 0x79, 0x22, 0x93, 0x71, 0x91, 0x19, 0xC0, 0xC0, 0x83, 0x23,
			0x79, 0x32, 0x41, 0xFF, 0x40, 0x08, 0x10, 0xB8, 0x74, 0x98, 0x4E, 0x6F, 0xC1, 0xD8, 0xA1, 0x38,
			0x26, 0xDD, 0x57, 0xA6, 0xA5, 0x53, 0x28, 0x4A, 0x0B, 0x5F, 0xB5, 0xC3, 0xF1, 0x56, 0xE8, 0x75,
			0x9C, 0xA7, 0xF2, 0x46, 0xD6, 0x42, 0x82, 0xF0, 0x33, 0xC8, 0x89, 0xD6, 0x7B, 0xF0, 0x16, 0xEA,
			0xBF, 0xD6, 0x05, 0xCE, 0x40, 0x1B, 0x36, 0x78, 0xB9, 0x79, 0x20, 0x4E, 0xB1, 0x75, 0x41, 0x28,
			0x6E, 0xFC, 0x66, 0xC7, 0x3C, 0xA3, 0x02, 0x03, 0x01, 0x00, 0x01, 0x02, 0x82, 0x01, 0x00, 0x5D,
			0xB6, 0x8C, 0xB0, 0xDA, 0xDF, 0x8C, 0x8A, 0x76, 0x7B, 0x37, 0xA9, 0xF7, 0x7B, 0xB6, 0x8F, 0x82,
			0xDC, 0x3E, 0x61, 0x47, 0x30, 0x1C, 0x32, 0x7E, 0x80, 0xCE, 0xF7, 0xFD, 0xA9, 0xCF, 0x95, 0xC9,
			0xB1, 0x08, 0xE9, 0x19, 0xE3, 0x4C, 0x7C, 0x43, 0x65, 0x62, 0xB9, 0x11, 0xA8, 0xD2, 0x3F, 0x8F,
			0xEC, 0x43, 0x5E, 0x5E, 0xF2, 0x2B, 0xD4, 0x93, 0x42, 0x68, 0x59, 0xD2, 0x79, 0xDD, 0xF7, 0x8B,
			0xFA, 0x19, 0xD0, 0xBF, 0x0B, 0x1A, 0x6F, 0x6F, 0x20, 0x82, 0x14, 0xA0, 0x86, 0xBC, 0x4C, 0xDA,
			0x41, 0xB0, 0x18, 0x0D, 0x57, 0x80, 0xEF, 0x92, 0x55, 0xAC, 0x2A, 0x26, 0xDF, 0x12, 0x8E, 0xF1,
			0x3E, 0x43, 0xEF, 0xFF, 0xD3, 0x56, 0x4A, 0x2B, 0x43, 0xB2, 0x03, 0x47, 0x03, 0x26, 0x35, 0xF7,
			0x2F, 0xD4, 0x68, 0x3D, 0x43, 0x7F, 0x9A, 0x83, 0x1E, 0x00, 0xF1, 0x70, 0xD2, 0x1A, 0xA4, 0x14,
			0x48, 0x66, 0xEF, 0x61, 0x92, 0x54, 0x21, 0x18, 0xD5, 0xE6, 0x3E, 0x70, 0xE5, 0xE6, 0x2F, 0x78,
			0x9C, 0xC6, 0x7B, 0x27, 0x95, 0x40, 0xFF, 0xFD, 0x24, 0xBD, 0xAB, 0x7D, 0xD1, 0xC4, 0x5D, 0xB2,
			0xE6, 0x88, 0x96, 0xD5, 0xE7, 0x6A, 0x71, 0x1A, 0xA1, 0x5B, 0xFE, 0xCB, 0xD7, 0x26, 0x0C, 0x6F,
			0x11, 0xC5, 0x51, 0xCC, 0x56, 0x87, 0xC5, 0x94, 0xC2, 0x39, 0xF5, 0x00, 0x08, 0x68, 0x08, 0xE5,
			0x33, 0x17, 0xC6, 0x41, 0xFB, 0x45, 0xFF, 0x3C, 0xF8, 0x7E, 0xD6, 0x76, 0x28, 0xAB, 0xAC, 0x70,
			0xA8, 0xBD, 0x19, 0x28, 0x3C, 0x2B, 0x43, 0xC4, 0x83, 0x85, 0x6F, 0xEB, 0x34, 0x32, 0xDE, 0x3B,
			0xD8, 0x22, 0x73, 0x9A, 0xE5, 0xEC, 0x47, 0xAD, 0x45, 0x04, 0x5B, 0x16, 0xFB, 0x19, 0xE3, 0x40,
			0x1D, 0xB1, 0x7D, 0xB0, 0x53, 0xE9, 0x56, 0x15, 0x49, 0x01, 0xE3, 0x60, 0x23, 0xBA, 0x81, 0x02,
			0x81, 0x81, 0x00, 0xE7, 0x3F, 0xC2, 0x5E, 0xA0, 0xC5, 0x7D, 0x9F, 0x0C, 0x5C, 0x23, 0xC0, 0x39,
			0xEB, 0xA2, 0xF3, 0x2E, 0x47, 0x34, 0x3B, 0x6E, 0xDF, 0x46, 0x91, 0xF8, 0x73, 0x97, 0xB0, 0x10,
			0xE7, 0x44, 0x8F, 0x21, 0xB9, 0x7B, 0x06, 0x34, 0x3D, 0x38, 0x15, 0xF9, 0x97, 0x47, 0xB9, 0xE4,
			0x82, 0x1A, 0xF4, 0xF1, 0xF1, 0x55, 0x0E, 0x61, 0x38, 0x3D, 0xE2, 0x94, 0x93, 0xCD, 0x74, 0x60,
			0x96, 0xFE, 0x20, 0x02, 0x68, 0xF3, 0x0A, 0xCE, 0x67, 0x4E, 0xBC, 0xDA, 0x7E, 0xB2, 0x10, 0xC3,
			0xB9, 0xF2, 0x89, 0xAA, 0x2A, 0x29, 0xFE, 0x88, 0x85, 0x15, 0xAC, 0xF5, 0xCB, 0x48, 0xBA, 0x39,
			0x08, 0x28, 0x6B, 0xAB, 0x0D, 0x89, 0xE2, 0xF8, 0x33, 0xA2, 0x5C, 0xCF, 0xC3, 0x73, 0x79, 0x23,
			0xC1, 0x49, 0x74, 0xBA, 0x26, 0x6F, 0xD1, 0x64, 0xAD, 0x5F, 0x38, 0x1F, 0xE2, 0x2F, 0x88, 0xF2,
			0x32, 0x97, 0x21, 0x02, 0x81, 0x81, 0x00, 0xDF, 0x39, 0xF0, 0x00, 0x6D, 0xBD, 0x41, 0x7E, 0x80,
			0x4C, 0x47, 0xC5, 0xA4, 0x65, 0x4E, 0x72, 0x88, 0x28, 0xAC, 0x70, 0xA7, 0xB5, 0xDE, 0x27, 0x89,
			0xA5, 0x82, 0xAB, 0x99, 0xDE, 0xE6, 0xC1, 0x4B, 0xF8, 0x4C, 0x0B, 0x79, 0x57, 0x35, 0xCC, 0x3F,
			0x72, 0x8F, 0x56, 0xB1, 0x70, 0x37, 0xA5, 0x20, 0x20, 0xD9, 0xC4, 0x26, 0x72, 0x9D, 0x4E, 0xE4,
			0x0E, 0x7A, 0xD0, 0x70, 0x59, 0x13, 0xD1, 0xB8, 0xC7, 0xFE, 0x00, 0xBC, 0x26, 0x4D, 0xEF, 0xED,
			0x74, 0xFD, 0x97, 0x55, 0x03, 0x0E, 0xA0, 0xB5, 0x6F, 0xBA, 0xE6, 0xFD, 0x7E, 0x70, 0x14, 0x86,
			0x7F, 0xAE, 0x63, 0x5A, 0xD6, 0xB5, 0x59, 0x84, 0xBD, 0x68, 0xFE, 0xD2, 0xB1, 0xE6, 0xDB, 0xCC,
			0xDA, 0xCC, 0x89, 0xD6, 0xAF, 0x79, 0xBF, 0xB3, 0x5D, 0xCA, 0x01, 0x48, 0x10, 0x85, 0xBE, 0xA9,
			0xB2, 0x0A, 0x6D, 0xCE, 0x96, 0xCF, 0x43, 0x02, 0x81, 0x80, 0x6C, 0x51, 0x97, 0x50, 0x0F, 0xEA,
			0xB1, 0xFF, 0x10, 0x21, 0x10, 0xB5, 0xF7, 0xEB, 0x82, 0x36, 0x7A, 0x94, 0xEB, 0xC8, 0x73, 0x14,
			0xAE, 0xCF, 0xAD, 0x1B, 0x28, 0x10, 0x56, 0xBA, 0x9D, 0x88, 0x95, 0xF9, 0x75, 0xC0, 0xE0, 0x33,
			0x54, 0xD4, 0x26, 0x47, 0x50, 0x57, 0xA8, 0xCB, 0xB0, 0xA8, 0xCF, 0xB3, 0x85, 0x6D, 0xE8, 0xE8,
			0x19, 0x44, 0xCA, 0xE7, 0xB8, 0xB3, 0x2C, 0x93, 0x4D, 0x91, 0xDC, 0xCF, 0x20, 0x19, 0x0D, 0xB9,
			0xA2, 0x4E, 0x1F, 0xE2, 0x7C, 0xB2, 0x11, 0x9C, 0x46, 0x19, 0x69, 0xD5, 0xBA, 0x39, 0xF9, 0xE4,
			0xAC, 0xD4, 0x89, 0x85, 0xA1, 0x19, 0x69, 0xA1, 0x82, 0x9D, 0x7C, 0x50, 0x29, 0x28, 0x61, 0xAE,
			0x7D, 0xFD, 0x0F, 0x6C, 0xB3, 0xE8, 0x28, 0x71, 0x5F, 0x61, 0x07, 0xD8, 0xFD, 0x43, 0x8D, 0xEF,
			0x0F, 0xCD, 0x10, 0x52, 0x38, 0x85, 0xE3, 0x3D, 0x03, 0x41, 0x02, 0x81, 0x80, 0x2E, 0xD7, 0x41,
			0x7D, 0x55, 0x89, 0xB9, 0x0C, 0x8A, 0x6F, 0x77, 0x40, 0x09, 0xD7, 0x18, 0x37, 0x00, 0x4B, 0x48,
			0xA3, 0xFB, 0x0D, 0x36, 0xA8, 0xA5, 0x41, 0x8D, 0xC1, 0xE4, 0x6F, 0xD9, 0x8C, 0x06, 0x1C, 0xFC,
			0x18, 0x0C, 0x46, 0x38, 0x8B, 0xBB, 0x64, 0x96, 0x9F, 0x62, 0x6C, 0x61, 0xC0, 0xCC, 0x95, 0x18,
			0x1D, 0x08, 0xD4, 0x54, 0x1E, 0x11, 0xCC, 0xD8, 0x08, 0x95, 0x0A, 0x9C, 0x16, 0x0D, 0xE8, 0x29,
			0x6C, 0x8E, 0x0E, 0x9B, 0x9C, 0x14, 0xFF, 0xCF, 0x96, 0xC9, 0xC7, 0xF2, 0x71, 0xD6, 0xA0, 0xB3,
			0x5F, 0x75, 0x21, 0xEA, 0xF2, 0xE3, 0xA6, 0x37, 0x39, 0xB1, 0xFE, 0x0B, 0xDF, 0xD4, 0xF2, 0xC9,
			0xED, 0x6E, 0xD8, 0xD5, 0xD0, 0x99, 0x93, 0xF0, 0x07, 0x9C, 0x7D, 0x05, 0xD7, 0x2C, 0x14, 0x2A,
			0x27, 0x4A, 0xAF, 0xEC, 0xE0, 0xAD, 0x4B, 0x26, 0xD5, 0x13, 0xDC, 0xA1, 0x71, 0x02, 0x81, 0x81,
			0x00, 0xD1, 0x9C, 0x43, 0xC9, 0xCE, 0x6E, 0x2D, 0xE6, 0xE3, 0x04, 0x4E, 0xC8, 0xAA, 0xE4, 0x09,
			0x67, 0x16, 0xC4, 0x51, 0x4C, 0x9E, 0x9C, 0x31, 0xBF, 0x4A, 0x56, 0xEF, 0x6E, 0xC7, 0x9F, 0xDC,
			0x2E, 0x68, 0xEB, 0x38, 0x51, 0xB7, 0xAC, 0x0A, 0x7C, 0x26, 0xA5, 0xC3, 0x13, 0x7F, 0x31, 0x94,
			0x0E, 0xEC, 0xD8, 0x5C, 0x2B, 0x40, 0xAB, 0x6A, 0x49, 0x97, 0xAE, 0x07, 0x1B, 0xAC, 0x2C, 0x76,
			0x45, 0xA6, 0x8C, 0x14, 0xC9, 0x12, 0x99, 0xBA, 0x6F, 0xD8, 0x9B, 0x38, 0x13, 0x77, 0xA8, 0x55,
			0x76, 0xCD, 0x0D, 0x07, 0xCB, 0x22, 0xA5, 0x31, 0x6C, 0x48, 0xB9, 0x54, 0xA3, 0xF6, 0x03, 0xA8,
			0xEB, 0x58, 0x45, 0xED, 0x41, 0xFD, 0x5C, 0x1E, 0x91, 0xE0, 0x74, 0x5D, 0x96, 0x90, 0x4E, 0xB8,
			0x86, 0xE0, 0x01, 0x66, 0x78, 0xE9, 0xD9, 0x23, 0xF7, 0xF1, 0xCC, 0xF6, 0x8B, 0xDD, 0x3F, 0x42,
			0x32
	};

	private static short[] RFC_TEST_RSA_PUBLIC_KEY = new short[] {
			0x30, 0x82, 0x01, 0x22, 0x30, 0x0D, 0x06, 0x09, 0x2A, 0x86, 0x48, 0x86, 0xF7, 0x0D, 0x01, 0x01,
			0x01, 0x05, 0x00, 0x03, 0x82, 0x01, 0x0F, 0x00, 0x30, 0x82, 0x01, 0x0A, 0x02, 0x82, 0x01, 0x01,
			0x00, 0xC9, 0xA4, 0xE0, 0x4E, 0xDE, 0x77, 0xA6, 0x1D, 0xE9, 0xE4, 0x61, 0xE0, 0xC2, 0x81, 0x96,
			0xC3, 0x3E, 0x61, 0x45, 0xF5, 0x97, 0x49, 0x00, 0x34, 0xF0, 0xD0, 0x8E, 0xC1, 0xED, 0x05, 0x12,
			0x00, 0x0B, 0x5A, 0x8B, 0x3D, 0x18, 0x28, 0xCD, 0x14, 0x27, 0x7B, 0xDB, 0x79, 0xC2, 0x1F, 0x10,
			0x6D, 0x37, 0x5A, 0x9D, 0xEF, 0x83, 0x12, 0x87, 0xFB, 0x8D, 0xF3, 0xC2, 0x4F, 0x21, 0xBC, 0x31,
			0x2A, 0x17, 0x83, 0xA7, 0x89, 0x31, 0xA3, 0x86, 0x0C, 0x37, 0x9B, 0x6B, 0x3D, 0xA1, 0x74, 0x7B,
			0xD1, 0xBA, 0x06, 0x3D, 0x4D, 0xD3, 0x61, 0xE7, 0x6A, 0x7C, 0x45, 0x2D, 0x6F, 0xA0, 0x98, 0xB6,
			0xE0, 0x60, 0xEF, 0xD2, 0x65, 0x87, 0xD6, 0x17, 0xF3, 0x3C, 0xC8, 0xB0, 0x5C, 0xBB, 0x96, 0x35,
			0x3A, 0xDD, 0x19, 0xC4, 0x30, 0xC3, 0x5D, 0x2F, 0x70, 0x21, 0x04, 0xED, 0x04, 0x4D, 0x27, 0x7B,
			0x76, 0x1B, 0xC6, 0x06, 0x49, 0x01, 0x94, 0xD4, 0xE5, 0x7A, 0xB2, 0x43, 0x50, 0xF1, 0x77, 0x36,
			0x32, 0x0B, 0x99, 0x45, 0xEB, 0x20, 0x5A, 0x47, 0x95, 0x10, 0xB4, 0x26, 0x13, 0x9D, 0x70, 0x00,
			0xA5, 0x54, 0x6E, 0x50, 0x8D, 0x92, 0x77, 0xA2, 0xF5, 0x13, 0x6B, 0xE5, 0xF5, 0xB4, 0x81, 0xBA,
			0x66, 0x79, 0x22, 0x93, 0x71, 0x91, 0x19, 0xC0, 0xC0, 0x83, 0x23, 0x79, 0x32, 0x41, 0xFF, 0x40,
			0x08, 0x10, 0xB8, 0x74, 0x98, 0x4E, 0x6F, 0xC1, 0xD8, 0xA1, 0x38, 0x26, 0xDD, 0x57, 0xA6, 0xA5,
			0x53, 0x28, 0x4A, 0x0B, 0x5F, 0xB5, 0xC3, 0xF1, 0x56, 0xE8, 0x75, 0x9C, 0xA7, 0xF2, 0x46, 0xD6,
			0x42, 0x82, 0xF0, 0x33, 0xC8, 0x89, 0xD6, 0x7B, 0xF0, 0x16, 0xEA, 0xBF, 0xD6, 0x05, 0xCE, 0x40,
			0x1B, 0x36, 0x78, 0xB9, 0x79, 0x20, 0x4E, 0xB1, 0x75, 0x41, 0x28, 0x6E, 0xFC, 0x66, 0xC7, 0x3C,
			0xA3, 0x02, 0x03, 0x01, 0x00, 0x01
	};

	// A.1.1.1.  Test Vector v1-E-1
	private static byte[] RFC_TEST_VECTOR_V1_E_1_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_1_NONCE = rfcTestNonce1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_1_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_1_FOOTER = null;
	private static String RFC_TEST_VECTOR_V1_E_1_TOKEN
			= "v1.local.WzhIh1MpbqVNXNt7-HbWvL-JwAym3Tomad9Pc2nl7wK87vGraUV"
			+ "vn2bs8BBNo7jbukCNrkVID0jCK2vr5bP18G78j1bOTbBcP9HZzqnraEdspcj"
			+ "d_PvrxDEhj9cS2MG5fmxtvuoHRp3M24HvxTtql9z26KTfPWxJN5bAJaAM6go"
			+ "s8fnfjJO8oKiqQMaiBP_Cqncmqw8";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_1
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_1_KEY, RFC_TEST_VECTOR_V1_E_1_NONCE, RFC_TEST_VECTOR_V1_E_1_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_1_FOOTER, RFC_TEST_VECTOR_V1_E_1_TOKEN);

	// A.1.1.2.  Test Vector v1-E-2
	private static byte[] RFC_TEST_VECTOR_V1_E_2_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_2_NONCE = rfcTestNonce1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_2_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_2_FOOTER = null;
	private static String RFC_TEST_VECTOR_V1_E_2_TOKEN
			= "v1.local.w_NOpjgte4bX-2i1JAiTQzHoGUVOgc2yqKqsnYGmaPaCu_KWUkR"
			+ "GlCRnOvZZxeH4HTykY7AE_jkzSXAYBkQ1QnwvKS16uTXNfnmp8IRknY76I2m"
			+ "3S5qsM8klxWQQKFDuQHl8xXV0MwAoeFh9X6vbwIqrLlof3s4PMjRDwKsxYzk"
			+ "Mr1RvfDI8emoPoW83q4Q60_xpHaw";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_2
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_2_KEY, RFC_TEST_VECTOR_V1_E_2_NONCE, RFC_TEST_VECTOR_V1_E_2_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_2_FOOTER, RFC_TEST_VECTOR_V1_E_2_TOKEN);

	// A.1.1.3.  Test Vector v1-E-3
	private static byte[] RFC_TEST_VECTOR_V1_E_3_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_3_NONCE = rfcTestNonceV1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_3_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_3_FOOTER = null;
	private static String RFC_TEST_VECTOR_V1_E_3_TOKEN
			= "v1.local.4VyfcVcFAOAbB8yEM1j1Ob7Iez5VZJy5kHNsQxmlrAwKUbOtq9c"
			+ "v39T2fC0MDWafX0nQJ4grFZzTdroMvU772RW-X1oTtoFBjsl_3YYHWnwgqzs"
			+ "0aFc3ejjORmKP4KUM339W3syBYyjKIOeWnsFQB6Yef-1ov9rvqt7TmwONUHe"
			+ "JUYk4IK_JEdUeo_uFRqAIgHsiGCg";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_3
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_3_KEY, RFC_TEST_VECTOR_V1_E_3_NONCE, RFC_TEST_VECTOR_V1_E_3_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_3_FOOTER, RFC_TEST_VECTOR_V1_E_3_TOKEN);

	// A.1.1.4.  Test Vector v1-E-4
	private static byte[] RFC_TEST_VECTOR_V1_E_4_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_4_NONCE = rfcTestNonceV1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_4_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_4_FOOTER = null;
	private static String RFC_TEST_VECTOR_V1_E_4_TOKEN
			= "v1.local.IddlRQmpk6ojcD10z1EYdLexXvYiadtY0MrYQaRnq3dnqKIWcbb"
			+ "pOcgXdMIkm3_3gksirTj81bvWrWkQwcUHilt-tQo7LZK8I6HCK1V78B9YeEq"
			+ "GNeeWXOyWWHoJQIe0d5nTdvejdt2Srz_5Q0QG4oiz1gB_wmv4U5pifedaZbH"
			+ "XUTWXchFEi0etJ4u6tqgxZSklcec";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_4
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_4_KEY, RFC_TEST_VECTOR_V1_E_4_NONCE, RFC_TEST_VECTOR_V1_E_4_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_4_FOOTER, RFC_TEST_VECTOR_V1_E_4_TOKEN);

	// A.1.1.5.  Test Vector v1-E-5
	private static byte[] RFC_TEST_VECTOR_V1_E_5_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_5_NONCE = rfcTestNonceV1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_5_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_5_FOOTER = "{\"kid\":\"UbkK8Y6iv4GZhFp6Tx3IWLWLfNXSEvJcdT3zdR65YZxo\"}";
	private static String RFC_TEST_VECTOR_V1_E_5_TOKEN
			= "v1.local.4VyfcVcFAOAbB8yEM1j1Ob7Iez5VZJy5kHNsQxmlrAwKUbOtq9c"
			+ "v39T2fC0MDWafX0nQJ4grFZzTdroMvU772RW-X1oTtoFBjsl_3YYHWnwgqzs"
			+ "0aFc3ejjORmKP4KUM339W3szA28OabR192eRqiyspQ6xPM35NMR-04-FhRJ"
			+ "ZEWiF0W5oWjPVtGPjeVjm2DI4YtJg.eyJraWQiOiJVYmtLOFk2aXY0R1poRn"
			+ "A2VHgzSVdMV0xmTlhTRXZKY2RUM3pkUjY1WVp4byJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_5
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_5_KEY, RFC_TEST_VECTOR_V1_E_5_NONCE, RFC_TEST_VECTOR_V1_E_5_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_5_FOOTER, RFC_TEST_VECTOR_V1_E_5_TOKEN);

	// A.1.1.6.  Test Vector v1-E-6
	private static byte[] RFC_TEST_VECTOR_V1_E_6_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V1_E_6_NONCE = rfcTestNonceV1();
	private static BasicPayload RFC_TEST_VECTOR_V1_E_6_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_E_6_FOOTER = "{\"kid\":\"UbkK8Y6iv4GZhFp6Tx3IWLWLfNXSEvJcdT3zdR65YZxo\"}";
	private static String RFC_TEST_VECTOR_V1_E_6_TOKEN
			= "v1.local.IddlRQmpk6ojcD10z1EYdLexXvYiadtY0MrYQaRnq3dnqKIWcbb"
			+ "pOcgXdMIkm3_3gksirTj81bvWrWkQwcUHilt-tQo7LZK8I6HCK1V78B9YeEq"
			+ "GNeeWXOyWWHoJQIe0d5nTdvcT2vnER6NrJ7xIowvFba6J4qMlFhBnYSxHEq9"
			+ "v9NlzcKsz1zscdjcAiXnEuCHyRSc.eyJraWQiOiJVYmtLOFk2aXY0R1poRnA"
			+ "2VHgzSVdMV0xmTlhTRXZKY2RUM3pkUjY1WVp4byJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_E_6
			= new TestVector<>(RFC_TEST_VECTOR_V1_E_6_KEY, RFC_TEST_VECTOR_V1_E_6_NONCE, RFC_TEST_VECTOR_V1_E_6_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V1_E_6_FOOTER, RFC_TEST_VECTOR_V1_E_6_TOKEN);
	
	// A.1.2.1.  Test Vector v1-S-1
	private static byte[] RFC_TEST_VECTOR_V1_S_1_SK = rfcTestV1PrivateKey();
	private static byte[] RFC_TEST_VECTOR_V1_S_1_PK = rfcTestV1PublicKey();
	private static BasicPayload RFC_TEST_VECTOR_V1_S_1_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_S_1_FOOTER = null;
	private static String RFC_TEST_VECTOR_V1_S_1_TOKEN
			= "v1.public.eyJkYXRhIjoidGhpcyBpcyBhIHNpZ25lZCBtZXNzYWdlIiw"
			+ "iZXhwIjoiMjAxOS0wMS0wMVQwMDowMDowMCswMDowMCJ9cIZKahKeGM5k"
			+ "iAS_4D70Qbz9FIThZpxetJ6n6E6kXP_119SvQcnfCSfY_gG3D0Q2v7FEt"
			+ "m2Cmj04lE6YdgiZ0RwA41WuOjXq7zSnmmHK9xOSH6_2yVgt207h1_LphJ"
			+ "zVztmZzq05xxhZsV3nFPm2cCu8oPceWy-DBKjALuMZt_Xj6hWFFie96Sf"
			+ "Q6i85lOsTX8Kc6SQaG-3CgThrJJ6W9DC-YfQ3lZ4TJUoY3QNYdtEgAvp1"
			+ "QuWWK6xmIb8BwvkBPej5t88QUb7NcvZ15VyNw3qemQGn2ITSdpdDgwMtp"
			+ "flZOeYdtuxQr1DSGO2aQyZl7s0WYn1IjdQFx6VjSQ4yfw";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_S_1
			= new TestVector<>(RFC_TEST_VECTOR_V1_S_1_SK, RFC_TEST_VECTOR_V1_S_1_PK,
			RFC_TEST_VECTOR_V1_S_1_PAYLOAD, BasicPayload.class, RFC_TEST_VECTOR_V1_S_1_FOOTER,
			RFC_TEST_VECTOR_V1_S_1_TOKEN);
	
	// A.1.2.2.  Test Vector v1-S-2
	private static byte[] RFC_TEST_VECTOR_V1_S_2_SK = rfcTestV1PrivateKey();
	private static byte[] RFC_TEST_VECTOR_V1_S_2_PK = rfcTestV1PublicKey();
	private static BasicPayload RFC_TEST_VECTOR_V1_S_2_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V1_S_2_FOOTER = "{\"kid\":\"dYkISylxQeecEcHELfzF88UZrwbLolNiCdpzUHGw9Uqn\"}";
	private static String RFC_TEST_VECTOR_V1_S_2_TOKEN
			= "v1.public.eyJkYXRhIjoidGhpcyBpcyBhIHNpZ25lZCBtZXNzYWdlIiw"
			+ "iZXhwIjoiMjAxOS0wMS0wMVQwMDowMDowMCswMDowMCJ9sBTIb0J_4mis"
			+ "AuYc4-6P5iR1rQighzktpXhJ8gtrrp2MqSSDkbb8q5WZh3FhUYuW_rg2X"
			+ "8aflDlTWKAqJkM3otjYwtmfwfOhRyykxRL2AfmIika_A-_MaLp9F0iw4S"
			+ "1JetQQDV8GUHjosd87TZ20lT2JQLhxKjBNJSwWue8ucGhTgJcpOhXcthq"
			+ "az7a2yudGyd0layzeWziBhdQpoBR6ryTdtIQX54hP59k3XCIxuYbB9qJM"
			+ "pixiPAEKBcjHT74sA-uukug9VgKO7heWHwJL4Rl9ad21xyNwaxAnwAJ7C"
			+ "0fN5oGv8Rl0dF11b3tRmsmbDoIokIM0Dba29x_T3YzOyg.eyJraWQiOiJ"
			+ "kWWtJU3lseFFlZWNFY0hFTGZ6Rjg4VVpyd2JMb2xOaUNkcHpVSEd3OVVx"
			+ "biJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V1_S_2
			= new TestVector<>(RFC_TEST_VECTOR_V1_S_2_SK, RFC_TEST_VECTOR_V1_S_2_PK,
			RFC_TEST_VECTOR_V1_S_2_PAYLOAD, BasicPayload.class, RFC_TEST_VECTOR_V1_S_2_FOOTER,
			RFC_TEST_VECTOR_V1_S_2_TOKEN);
	
	

	// A.2.1.1.  Test Vector v2-E-1
	private static byte[] RFC_TEST_VECTOR_V2_E_1_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_1_NONCE = rfcTestNonce1();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_1_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_1_FOOTER = null;
	private static String RFC_TEST_VECTOR_V2_E_1_TOKEN
			= "v2.local.97TTOvgwIxNGvV80XKiGZg_kD3tsXM_-qB4dZGHOeN1cTkgQ4Pn"
			+ "W8888l802W8d9AvEGnoNBY3BnqHORy8a5cC8aKpbA0En8XELw2yDk2f1sVOD"
			+ "yfnDbi6rEGMY3pSfCbLWMM2oHJxvlEl2XbQ";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_1
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_1_KEY, RFC_TEST_VECTOR_V2_E_1_NONCE, RFC_TEST_VECTOR_V2_E_1_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V2_E_1_FOOTER, RFC_TEST_VECTOR_V2_E_1_TOKEN);

	// A.2.1.2.  Test Vector v2-E-2
	private static byte[] RFC_TEST_VECTOR_V2_E_2_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_2_NONCE = rfcTestNonce1();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_2_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_2_FOOTER = null;
	private static String RFC_TEST_VECTOR_V2_E_2_TOKEN
			= "v2.local.CH50H-HM5tzdK4kOmQ8KbIvrzJfjYUGuu5Vy9ARSFHy9owVDMYg"
			+ "3-8rwtJZQjN9ABHb2njzFkvpr5cOYuRyt7CRXnHt42L5yZ7siD-4l-FoNsC7"
			+ "J2OlvLlIwlG06mzQVunrFNb7Z3_CHM0PK5w";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_2
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_2_KEY, RFC_TEST_VECTOR_V2_E_2_NONCE, RFC_TEST_VECTOR_V2_E_2_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V2_E_2_FOOTER, RFC_TEST_VECTOR_V2_E_2_TOKEN);

	// A.2.1.3.  Test Vector v2-E-3
	private static byte[] RFC_TEST_VECTOR_V2_E_3_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_3_NONCE = rfcTestNonceV2();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_3_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_3_FOOTER = null;
	private static String RFC_TEST_VECTOR_V2_E_3_TOKEN
			= "v2.local.5K4SCXNhItIhyNuVIZcwrdtaDKiyF81-eWHScuE0idiVqCo72bb"
			+ "jo07W05mqQkhLZdVbxEa5I_u5sgVk1QLkcWEcOSlLHwNpCkvmGGlbCdNExn6"
			+ "Qclw3qTKIIl5-O5xRBN076fSDPo5xUCPpBA";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_3
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_3_KEY, RFC_TEST_VECTOR_V2_E_3_NONCE, RFC_TEST_VECTOR_V2_E_3_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V2_E_3_FOOTER, RFC_TEST_VECTOR_V2_E_3_TOKEN);

	// A.2.1.4.  Test Vector v2-E-4
	private static byte[] RFC_TEST_VECTOR_V2_E_4_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_4_NONCE = rfcTestNonceV2();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_4_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_4_FOOTER = null;
	private static String RFC_TEST_VECTOR_V2_E_4_TOKEN
			= "v2.local.pvFdDeNtXxknVPsbBCZF6MGedVhPm40SneExdClOxa9HNR8wFv7"
			+ "cu1cB0B4WxDdT6oUc2toyLR6jA6sc-EUM5ll1EkeY47yYk6q8m1RCpqTIzUr"
			+ "Iu3B6h232h62DPbIxtjGvNRAwsLK7LcV8oQ";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_4
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_4_KEY, RFC_TEST_VECTOR_V2_E_4_NONCE, RFC_TEST_VECTOR_V2_E_4_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V2_E_4_FOOTER, RFC_TEST_VECTOR_V2_E_4_TOKEN);

	// A.2.1.5.  Test Vector v2-E-5
	private static byte[] RFC_TEST_VECTOR_V2_E_5_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_5_NONCE = rfcTestNonceV2();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_5_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_5_FOOTER = "{\"kid\":\"zVhMiPBP9fRf2snEcT7gFTioeA9COcNy9DfgL1W60haN\"}";
	private static String RFC_TEST_VECTOR_V2_E_5_TOKEN
			= "v2.local.5K4SCXNhItIhyNuVIZcwrdtaDKiyF81-eWHScuE0idiVqCo72bb"
			+ "jo07W05mqQkhLZdVbxEa5I_u5sgVk1QLkcWEcOSlLHwNpCkvmGGlbCdNExn6"
			+ "Qclw3qTKIIl5-zSLIrxZqOLwcFLYbVK1SrQ.eyJraWQiOiJ6VmhNaVBCUDlm"
			+ "UmYyc25FY1Q3Z0ZUaW9lQTlDT2NOeTlEZmdMMVc2MGhhTiJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_5
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_5_KEY, RFC_TEST_VECTOR_V2_E_5_NONCE, RFC_TEST_VECTOR_V2_E_5_PAYLOAD,
			BasicPayload.class, RFC_TEST_VECTOR_V2_E_5_FOOTER, RFC_TEST_VECTOR_V2_E_5_TOKEN);

	// A.2.1.6.  Test Vector v2-E-6
	private static byte[] RFC_TEST_VECTOR_V2_E_6_KEY = rfcTestKey();
	private static byte[] RFC_TEST_VECTOR_V2_E_6_NONCE = rfcTestNonceV2();
	private static BasicPayload RFC_TEST_VECTOR_V2_E_6_PAYLOAD
			= new BasicPayload("this is a secret message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_E_6_FOOTER = "{\"kid\":\"zVhMiPBP9fRf2snEcT7gFTioeA9COcNy9DfgL1W60haN\"}";
	private static String RFC_TEST_VECTOR_V2_E_6_TOKEN
			= "v2.local.pvFdDeNtXxknVPsbBCZF6MGedVhPm40SneExdClOxa9HNR8wFv7"
			+ "cu1cB0B4WxDdT6oUc2toyLR6jA6sc-EUM5ll1EkeY47yYk6q8m1RCpqTIzUr"
			+ "Iu3B6h232h62DnMXKdHn_Smp6L_NfaEnZ-A.eyJraWQiOiJ6VmhNaVBCUDlm"
			+ "UmYyc25FY1Q3Z0ZUaW9lQTlDT2NOeTlEZmdMMVc2MGhhTiJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_E_6
			= new TestVector<>(RFC_TEST_VECTOR_V2_E_6_KEY, RFC_TEST_VECTOR_V2_E_6_NONCE,
			RFC_TEST_VECTOR_V2_E_6_PAYLOAD, BasicPayload.class, RFC_TEST_VECTOR_V2_E_6_FOOTER,
			RFC_TEST_VECTOR_V2_E_6_TOKEN);

	// A.2.2.1.  Test Vector v2-S-1
	private static byte[] RFC_TEST_VECTOR_V2_S_1_SK = rfcTestV2SecretKey();
	private static byte[] RFC_TEST_VECTOR_V2_S_1_PK = rfcTestV2PublicKey();
	private static BasicPayload RFC_TEST_VECTOR_V2_S_1_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_S_1_FOOTER = null;
	private static String RFC_TEST_VECTOR_V2_S_1_TOKEN
			= "v2.public.eyJkYXRhIjoidGhpcyBpcyBhIHNpZ25lZCBtZXNzYWdlIi"
			+ "wiZXhwIjoiMjAxOS0wMS0wMVQwMDowMDowMCswMDowMCJ9HQr8URrGnt"
			+ "Tu7Dz9J2IF23d1M7-9lH9xiqdGyJNvzp4angPW5Esc7C5huy_M8I8_Dj"
			+ "JK2ZXC2SUYuOFM-Q_5Cw";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_S_1
			= new TestVector<>(RFC_TEST_VECTOR_V2_S_1_SK, RFC_TEST_VECTOR_V2_S_1_PK,
			RFC_TEST_VECTOR_V2_S_1_PAYLOAD, BasicPayload.class, RFC_TEST_VECTOR_V2_S_1_FOOTER,
			RFC_TEST_VECTOR_V2_S_1_TOKEN);

	// A.2.2.2.  Test Vector v2-S-2
	private static byte[] RFC_TEST_VECTOR_V2_S_2_SK = rfcTestV2SecretKey();
	private static byte[] RFC_TEST_VECTOR_V2_S_2_PK = rfcTestV2PublicKey();
	private static BasicPayload RFC_TEST_VECTOR_V2_S_2_PAYLOAD
			= new BasicPayload("this is a signed message", "2019-01-01T00:00:00+00:00");
	private static String RFC_TEST_VECTOR_V2_S_2_FOOTER = "{\"kid\":\"zVhMiPBP9fRf2snEcT7gFTioeA9COcNy9DfgL1W60haN\"}";
	private static String RFC_TEST_VECTOR_V2_S_2_TOKEN
			= "v2.public.eyJkYXRhIjoidGhpcyBpcyBhIHNpZ25lZCBtZXNzYWdlIi"
			+ "wiZXhwIjoiMjAxOS0wMS0wMVQwMDowMDowMCswMDowMCJ9flsZsx_gYC"
			+ "R0N_Ec2QxJFFpvQAs7h9HtKwbVK2n1MJ3Rz-hwe8KUqjnd8FAnIJZ601"
			+ "tp7lGkguU63oGbomhoBw.eyJraWQiOiJ6VmhNaVBCUDlmUmYyc25FY1Q"
			+ "3Z0ZUaW9lQTlDT2NOeTlEZmdMMVc2MGhhTiJ9";
	public static TestVector<BasicPayload> RFC_TEST_VECTOR_V2_S_2
			= new TestVector<>(RFC_TEST_VECTOR_V2_S_2_SK, RFC_TEST_VECTOR_V2_S_2_PK,
			RFC_TEST_VECTOR_V2_S_2_PAYLOAD, BasicPayload.class, RFC_TEST_VECTOR_V2_S_2_FOOTER,
			RFC_TEST_VECTOR_V2_S_2_TOKEN);

	// since java byte is unsigned
	private static byte[] convertToByteArray(short[] shortArray) {
		byte key[] = new byte[shortArray.length];
		for (int i = 0; i < key.length; ++i) {
			key[i] = (byte) shortArray[i];
		}
		return key;
	}

	public static byte[] rfcTestKey() {
		return convertToByteArray(RFC_TEST_KEY);
	}

	public static byte[] rfcTestNonce1() {
		return convertToByteArray(RFC_TEST_NONCE_1);
	}

	public static byte[] rfcTestNonceV1() {
		return convertToByteArray(RFC_TEST_NONCE_V1);
	}

	public static byte[] rfcTestNonceV2() {
		return convertToByteArray(RFC_TEST_NONCE_V2);
	}

	public static byte[] rfcTestV1PrivateKey() {
		return convertToByteArray(RFC_TEST_RSA_PRIVATE_KEY);
	}

	public static byte[] rfcTestV1PublicKey() {
		return convertToByteArray(RFC_TEST_RSA_PUBLIC_KEY);
	}

	public static byte[] rfcTestV2SecretKey() {
		return convertToByteArray(RFC_TEST_SK);
	}

	public static byte[] rfcTestV2PublicKey() {
		return convertToByteArray(RFC_TEST_PK);
	}
}
