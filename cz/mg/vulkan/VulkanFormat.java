package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormat.html">khronos documentation</a>
 **/
public class VulkanFormat extends VulkanEnum {
    public static final int UNDEFINED = VkFormat.VK_FORMAT_UNDEFINED;
    public static final int R4G4_UNORM_PACK8 = VkFormat.VK_FORMAT_R4G4_UNORM_PACK8;
    public static final int R4G4B4A4_UNORM_PACK16 = VkFormat.VK_FORMAT_R4G4B4A4_UNORM_PACK16;
    public static final int B4G4R4A4_UNORM_PACK16 = VkFormat.VK_FORMAT_B4G4R4A4_UNORM_PACK16;
    public static final int R5G6B5_UNORM_PACK16 = VkFormat.VK_FORMAT_R5G6B5_UNORM_PACK16;
    public static final int B5G6R5_UNORM_PACK16 = VkFormat.VK_FORMAT_B5G6R5_UNORM_PACK16;
    public static final int R5G5B5A1_UNORM_PACK16 = VkFormat.VK_FORMAT_R5G5B5A1_UNORM_PACK16;
    public static final int B5G5R5A1_UNORM_PACK16 = VkFormat.VK_FORMAT_B5G5R5A1_UNORM_PACK16;
    public static final int A1R5G5B5_UNORM_PACK16 = VkFormat.VK_FORMAT_A1R5G5B5_UNORM_PACK16;
    public static final int R8_UNORM = VkFormat.VK_FORMAT_R8_UNORM;
    public static final int R8_SNORM = VkFormat.VK_FORMAT_R8_SNORM;
    public static final int R8_USCALED = VkFormat.VK_FORMAT_R8_USCALED;
    public static final int R8_SSCALED = VkFormat.VK_FORMAT_R8_SSCALED;
    public static final int R8_UINT = VkFormat.VK_FORMAT_R8_UINT;
    public static final int R8_SINT = VkFormat.VK_FORMAT_R8_SINT;
    public static final int R8_SRGB = VkFormat.VK_FORMAT_R8_SRGB;
    public static final int R8G8_UNORM = VkFormat.VK_FORMAT_R8G8_UNORM;
    public static final int R8G8_SNORM = VkFormat.VK_FORMAT_R8G8_SNORM;
    public static final int R8G8_USCALED = VkFormat.VK_FORMAT_R8G8_USCALED;
    public static final int R8G8_SSCALED = VkFormat.VK_FORMAT_R8G8_SSCALED;
    public static final int R8G8_UINT = VkFormat.VK_FORMAT_R8G8_UINT;
    public static final int R8G8_SINT = VkFormat.VK_FORMAT_R8G8_SINT;
    public static final int R8G8_SRGB = VkFormat.VK_FORMAT_R8G8_SRGB;
    public static final int R8G8B8_UNORM = VkFormat.VK_FORMAT_R8G8B8_UNORM;
    public static final int R8G8B8_SNORM = VkFormat.VK_FORMAT_R8G8B8_SNORM;
    public static final int R8G8B8_USCALED = VkFormat.VK_FORMAT_R8G8B8_USCALED;
    public static final int R8G8B8_SSCALED = VkFormat.VK_FORMAT_R8G8B8_SSCALED;
    public static final int R8G8B8_UINT = VkFormat.VK_FORMAT_R8G8B8_UINT;
    public static final int R8G8B8_SINT = VkFormat.VK_FORMAT_R8G8B8_SINT;
    public static final int R8G8B8_SRGB = VkFormat.VK_FORMAT_R8G8B8_SRGB;
    public static final int B8G8R8_UNORM = VkFormat.VK_FORMAT_B8G8R8_UNORM;
    public static final int B8G8R8_SNORM = VkFormat.VK_FORMAT_B8G8R8_SNORM;
    public static final int B8G8R8_USCALED = VkFormat.VK_FORMAT_B8G8R8_USCALED;
    public static final int B8G8R8_SSCALED = VkFormat.VK_FORMAT_B8G8R8_SSCALED;
    public static final int B8G8R8_UINT = VkFormat.VK_FORMAT_B8G8R8_UINT;
    public static final int B8G8R8_SINT = VkFormat.VK_FORMAT_B8G8R8_SINT;
    public static final int B8G8R8_SRGB = VkFormat.VK_FORMAT_B8G8R8_SRGB;
    public static final int R8G8B8A8_UNORM = VkFormat.VK_FORMAT_R8G8B8A8_UNORM;
    public static final int R8G8B8A8_SNORM = VkFormat.VK_FORMAT_R8G8B8A8_SNORM;
    public static final int R8G8B8A8_USCALED = VkFormat.VK_FORMAT_R8G8B8A8_USCALED;
    public static final int R8G8B8A8_SSCALED = VkFormat.VK_FORMAT_R8G8B8A8_SSCALED;
    public static final int R8G8B8A8_UINT = VkFormat.VK_FORMAT_R8G8B8A8_UINT;
    public static final int R8G8B8A8_SINT = VkFormat.VK_FORMAT_R8G8B8A8_SINT;
    public static final int R8G8B8A8_SRGB = VkFormat.VK_FORMAT_R8G8B8A8_SRGB;
    public static final int B8G8R8A8_UNORM = VkFormat.VK_FORMAT_B8G8R8A8_UNORM;
    public static final int B8G8R8A8_SNORM = VkFormat.VK_FORMAT_B8G8R8A8_SNORM;
    public static final int B8G8R8A8_USCALED = VkFormat.VK_FORMAT_B8G8R8A8_USCALED;
    public static final int B8G8R8A8_SSCALED = VkFormat.VK_FORMAT_B8G8R8A8_SSCALED;
    public static final int B8G8R8A8_UINT = VkFormat.VK_FORMAT_B8G8R8A8_UINT;
    public static final int B8G8R8A8_SINT = VkFormat.VK_FORMAT_B8G8R8A8_SINT;
    public static final int B8G8R8A8_SRGB = VkFormat.VK_FORMAT_B8G8R8A8_SRGB;
    public static final int A8B8G8R8_UNORM_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_UNORM_PACK32;
    public static final int A8B8G8R8_SNORM_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SNORM_PACK32;
    public static final int A8B8G8R8_USCALED_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_USCALED_PACK32;
    public static final int A8B8G8R8_SSCALED_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SSCALED_PACK32;
    public static final int A8B8G8R8_UINT_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_UINT_PACK32;
    public static final int A8B8G8R8_SINT_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SINT_PACK32;
    public static final int A8B8G8R8_SRGB_PACK32 = VkFormat.VK_FORMAT_A8B8G8R8_SRGB_PACK32;
    public static final int A2R10G10B10_UNORM_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_UNORM_PACK32;
    public static final int A2R10G10B10_SNORM_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SNORM_PACK32;
    public static final int A2R10G10B10_USCALED_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_USCALED_PACK32;
    public static final int A2R10G10B10_SSCALED_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SSCALED_PACK32;
    public static final int A2R10G10B10_UINT_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_UINT_PACK32;
    public static final int A2R10G10B10_SINT_PACK32 = VkFormat.VK_FORMAT_A2R10G10B10_SINT_PACK32;
    public static final int A2B10G10R10_UNORM_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_UNORM_PACK32;
    public static final int A2B10G10R10_SNORM_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SNORM_PACK32;
    public static final int A2B10G10R10_USCALED_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_USCALED_PACK32;
    public static final int A2B10G10R10_SSCALED_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SSCALED_PACK32;
    public static final int A2B10G10R10_UINT_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_UINT_PACK32;
    public static final int A2B10G10R10_SINT_PACK32 = VkFormat.VK_FORMAT_A2B10G10R10_SINT_PACK32;
    public static final int R16_UNORM = VkFormat.VK_FORMAT_R16_UNORM;
    public static final int R16_SNORM = VkFormat.VK_FORMAT_R16_SNORM;
    public static final int R16_USCALED = VkFormat.VK_FORMAT_R16_USCALED;
    public static final int R16_SSCALED = VkFormat.VK_FORMAT_R16_SSCALED;
    public static final int R16_UINT = VkFormat.VK_FORMAT_R16_UINT;
    public static final int R16_SINT = VkFormat.VK_FORMAT_R16_SINT;
    public static final int R16_SFLOAT = VkFormat.VK_FORMAT_R16_SFLOAT;
    public static final int R16G16_UNORM = VkFormat.VK_FORMAT_R16G16_UNORM;
    public static final int R16G16_SNORM = VkFormat.VK_FORMAT_R16G16_SNORM;
    public static final int R16G16_USCALED = VkFormat.VK_FORMAT_R16G16_USCALED;
    public static final int R16G16_SSCALED = VkFormat.VK_FORMAT_R16G16_SSCALED;
    public static final int R16G16_UINT = VkFormat.VK_FORMAT_R16G16_UINT;
    public static final int R16G16_SINT = VkFormat.VK_FORMAT_R16G16_SINT;
    public static final int R16G16_SFLOAT = VkFormat.VK_FORMAT_R16G16_SFLOAT;
    public static final int R16G16B16_UNORM = VkFormat.VK_FORMAT_R16G16B16_UNORM;
    public static final int R16G16B16_SNORM = VkFormat.VK_FORMAT_R16G16B16_SNORM;
    public static final int R16G16B16_USCALED = VkFormat.VK_FORMAT_R16G16B16_USCALED;
    public static final int R16G16B16_SSCALED = VkFormat.VK_FORMAT_R16G16B16_SSCALED;
    public static final int R16G16B16_UINT = VkFormat.VK_FORMAT_R16G16B16_UINT;
    public static final int R16G16B16_SINT = VkFormat.VK_FORMAT_R16G16B16_SINT;
    public static final int R16G16B16_SFLOAT = VkFormat.VK_FORMAT_R16G16B16_SFLOAT;
    public static final int R16G16B16A16_UNORM = VkFormat.VK_FORMAT_R16G16B16A16_UNORM;
    public static final int R16G16B16A16_SNORM = VkFormat.VK_FORMAT_R16G16B16A16_SNORM;
    public static final int R16G16B16A16_USCALED = VkFormat.VK_FORMAT_R16G16B16A16_USCALED;
    public static final int R16G16B16A16_SSCALED = VkFormat.VK_FORMAT_R16G16B16A16_SSCALED;
    public static final int R16G16B16A16_UINT = VkFormat.VK_FORMAT_R16G16B16A16_UINT;
    public static final int R16G16B16A16_SINT = VkFormat.VK_FORMAT_R16G16B16A16_SINT;
    public static final int R16G16B16A16_SFLOAT = VkFormat.VK_FORMAT_R16G16B16A16_SFLOAT;
    public static final int R32_UINT = VkFormat.VK_FORMAT_R32_UINT;
    public static final int R32_SINT = VkFormat.VK_FORMAT_R32_SINT;
    public static final int R32_SFLOAT = VkFormat.VK_FORMAT_R32_SFLOAT;
    public static final int R32G32_UINT = VkFormat.VK_FORMAT_R32G32_UINT;
    public static final int R32G32_SINT = VkFormat.VK_FORMAT_R32G32_SINT;
    public static final int R32G32_SFLOAT = VkFormat.VK_FORMAT_R32G32_SFLOAT;
    public static final int R32G32B32_UINT = VkFormat.VK_FORMAT_R32G32B32_UINT;
    public static final int R32G32B32_SINT = VkFormat.VK_FORMAT_R32G32B32_SINT;
    public static final int R32G32B32_SFLOAT = VkFormat.VK_FORMAT_R32G32B32_SFLOAT;
    public static final int R32G32B32A32_UINT = VkFormat.VK_FORMAT_R32G32B32A32_UINT;
    public static final int R32G32B32A32_SINT = VkFormat.VK_FORMAT_R32G32B32A32_SINT;
    public static final int R32G32B32A32_SFLOAT = VkFormat.VK_FORMAT_R32G32B32A32_SFLOAT;
    public static final int R64_UINT = VkFormat.VK_FORMAT_R64_UINT;
    public static final int R64_SINT = VkFormat.VK_FORMAT_R64_SINT;
    public static final int R64_SFLOAT = VkFormat.VK_FORMAT_R64_SFLOAT;
    public static final int R64G64_UINT = VkFormat.VK_FORMAT_R64G64_UINT;
    public static final int R64G64_SINT = VkFormat.VK_FORMAT_R64G64_SINT;
    public static final int R64G64_SFLOAT = VkFormat.VK_FORMAT_R64G64_SFLOAT;
    public static final int R64G64B64_UINT = VkFormat.VK_FORMAT_R64G64B64_UINT;
    public static final int R64G64B64_SINT = VkFormat.VK_FORMAT_R64G64B64_SINT;
    public static final int R64G64B64_SFLOAT = VkFormat.VK_FORMAT_R64G64B64_SFLOAT;
    public static final int R64G64B64A64_UINT = VkFormat.VK_FORMAT_R64G64B64A64_UINT;
    public static final int R64G64B64A64_SINT = VkFormat.VK_FORMAT_R64G64B64A64_SINT;
    public static final int R64G64B64A64_SFLOAT = VkFormat.VK_FORMAT_R64G64B64A64_SFLOAT;
    public static final int B10G11R11_UFLOAT_PACK32 = VkFormat.VK_FORMAT_B10G11R11_UFLOAT_PACK32;
    public static final int E5B9G9R9_UFLOAT_PACK32 = VkFormat.VK_FORMAT_E5B9G9R9_UFLOAT_PACK32;
    public static final int D16_UNORM = VkFormat.VK_FORMAT_D16_UNORM;
    public static final int X8_D24_UNORM_PACK32 = VkFormat.VK_FORMAT_X8_D24_UNORM_PACK32;
    public static final int D32_SFLOAT = VkFormat.VK_FORMAT_D32_SFLOAT;
    public static final int S8_UINT = VkFormat.VK_FORMAT_S8_UINT;
    public static final int D16_UNORM_S8_UINT = VkFormat.VK_FORMAT_D16_UNORM_S8_UINT;
    public static final int D24_UNORM_S8_UINT = VkFormat.VK_FORMAT_D24_UNORM_S8_UINT;
    public static final int D32_SFLOAT_S8_UINT = VkFormat.VK_FORMAT_D32_SFLOAT_S8_UINT;
    public static final int BC1_RGB_UNORM_BLOCK = VkFormat.VK_FORMAT_BC1_RGB_UNORM_BLOCK;
    public static final int BC1_RGB_SRGB_BLOCK = VkFormat.VK_FORMAT_BC1_RGB_SRGB_BLOCK;
    public static final int BC1_RGBA_UNORM_BLOCK = VkFormat.VK_FORMAT_BC1_RGBA_UNORM_BLOCK;
    public static final int BC1_RGBA_SRGB_BLOCK = VkFormat.VK_FORMAT_BC1_RGBA_SRGB_BLOCK;
    public static final int BC2_UNORM_BLOCK = VkFormat.VK_FORMAT_BC2_UNORM_BLOCK;
    public static final int BC2_SRGB_BLOCK = VkFormat.VK_FORMAT_BC2_SRGB_BLOCK;
    public static final int BC3_UNORM_BLOCK = VkFormat.VK_FORMAT_BC3_UNORM_BLOCK;
    public static final int BC3_SRGB_BLOCK = VkFormat.VK_FORMAT_BC3_SRGB_BLOCK;
    public static final int BC4_UNORM_BLOCK = VkFormat.VK_FORMAT_BC4_UNORM_BLOCK;
    public static final int BC4_SNORM_BLOCK = VkFormat.VK_FORMAT_BC4_SNORM_BLOCK;
    public static final int BC5_UNORM_BLOCK = VkFormat.VK_FORMAT_BC5_UNORM_BLOCK;
    public static final int BC5_SNORM_BLOCK = VkFormat.VK_FORMAT_BC5_SNORM_BLOCK;
    public static final int BC6H_UFLOAT_BLOCK = VkFormat.VK_FORMAT_BC6H_UFLOAT_BLOCK;
    public static final int BC6H_SFLOAT_BLOCK = VkFormat.VK_FORMAT_BC6H_SFLOAT_BLOCK;
    public static final int BC7_UNORM_BLOCK = VkFormat.VK_FORMAT_BC7_UNORM_BLOCK;
    public static final int BC7_SRGB_BLOCK = VkFormat.VK_FORMAT_BC7_SRGB_BLOCK;
    public static final int ETC2_R8G8B8_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK;
    public static final int ETC2_R8G8B8_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK;
    public static final int ETC2_R8G8B8A1_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK;
    public static final int ETC2_R8G8B8A1_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK;
    public static final int ETC2_R8G8B8A8_UNORM_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK;
    public static final int ETC2_R8G8B8A8_SRGB_BLOCK = VkFormat.VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK;
    public static final int EAC_R11_UNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11_UNORM_BLOCK;
    public static final int EAC_R11_SNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11_SNORM_BLOCK;
    public static final int EAC_R11G11_UNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11G11_UNORM_BLOCK;
    public static final int EAC_R11G11_SNORM_BLOCK = VkFormat.VK_FORMAT_EAC_R11G11_SNORM_BLOCK;
    public static final int ASTC_4x4_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_4x4_UNORM_BLOCK;
    public static final int ASTC_4x4_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_4x4_SRGB_BLOCK;
    public static final int ASTC_5x4_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_5x4_UNORM_BLOCK;
    public static final int ASTC_5x4_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_5x4_SRGB_BLOCK;
    public static final int ASTC_5x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_5x5_UNORM_BLOCK;
    public static final int ASTC_5x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_5x5_SRGB_BLOCK;
    public static final int ASTC_6x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_6x5_UNORM_BLOCK;
    public static final int ASTC_6x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_6x5_SRGB_BLOCK;
    public static final int ASTC_6x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_6x6_UNORM_BLOCK;
    public static final int ASTC_6x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_6x6_SRGB_BLOCK;
    public static final int ASTC_8x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x5_UNORM_BLOCK;
    public static final int ASTC_8x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x5_SRGB_BLOCK;
    public static final int ASTC_8x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x6_UNORM_BLOCK;
    public static final int ASTC_8x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x6_SRGB_BLOCK;
    public static final int ASTC_8x8_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_8x8_UNORM_BLOCK;
    public static final int ASTC_8x8_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_8x8_SRGB_BLOCK;
    public static final int ASTC_10x5_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x5_UNORM_BLOCK;
    public static final int ASTC_10x5_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x5_SRGB_BLOCK;
    public static final int ASTC_10x6_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x6_UNORM_BLOCK;
    public static final int ASTC_10x6_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x6_SRGB_BLOCK;
    public static final int ASTC_10x8_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x8_UNORM_BLOCK;
    public static final int ASTC_10x8_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x8_SRGB_BLOCK;
    public static final int ASTC_10x10_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_10x10_UNORM_BLOCK;
    public static final int ASTC_10x10_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_10x10_SRGB_BLOCK;
    public static final int ASTC_12x10_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_12x10_UNORM_BLOCK;
    public static final int ASTC_12x10_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_12x10_SRGB_BLOCK;
    public static final int ASTC_12x12_UNORM_BLOCK = VkFormat.VK_FORMAT_ASTC_12x12_UNORM_BLOCK;
    public static final int ASTC_12x12_SRGB_BLOCK = VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK;
    public static final int G8B8G8R8_422_UNORM = VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM;
    public static final int B8G8R8G8_422_UNORM = VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM;
    public static final int G8_B8_R8_3PLANE_420_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM;
    public static final int G8_B8R8_2PLANE_420_UNORM = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM;
    public static final int G8_B8_R8_3PLANE_422_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM;
    public static final int G8_B8R8_2PLANE_422_UNORM = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM;
    public static final int G8_B8_R8_3PLANE_444_UNORM = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM;
    public static final int R10X6_UNORM_PACK16 = VkFormat.VK_FORMAT_R10X6_UNORM_PACK16;
    public static final int R10X6G10X6_UNORM_2PACK16 = VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16;
    public static final int R10X6G10X6B10X6A10X6_UNORM_4PACK16 = VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16;
    public static final int G10X6B10X6G10X6R10X6_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16;
    public static final int B10X6G10X6R10X6G10X6_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16;
    public static final int G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16;
    public static final int G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16;
    public static final int G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16;
    public static final int G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16;
    public static final int G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16 = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16;
    public static final int R12X4_UNORM_PACK16 = VkFormat.VK_FORMAT_R12X4_UNORM_PACK16;
    public static final int R12X4G12X4_UNORM_2PACK16 = VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16;
    public static final int R12X4G12X4B12X4A12X4_UNORM_4PACK16 = VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16;
    public static final int G12X4B12X4G12X4R12X4_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16;
    public static final int B12X4G12X4R12X4G12X4_422_UNORM_4PACK16 = VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16;
    public static final int G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16;
    public static final int G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16;
    public static final int G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16;
    public static final int G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16;
    public static final int G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16 = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16;
    public static final int G16B16G16R16_422_UNORM = VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM;
    public static final int B16G16R16G16_422_UNORM = VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM;
    public static final int G16_B16_R16_3PLANE_420_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM;
    public static final int G16_B16R16_2PLANE_420_UNORM = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM;
    public static final int G16_B16_R16_3PLANE_422_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM;
    public static final int G16_B16R16_2PLANE_422_UNORM = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM;
    public static final int G16_B16_R16_3PLANE_444_UNORM = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM;
    public static final int PVRTC1_2BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG;
    public static final int PVRTC1_4BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG;
    public static final int PVRTC2_2BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG;
    public static final int PVRTC2_4BPP_UNORM_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG;
    public static final int PVRTC1_2BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG;
    public static final int PVRTC1_4BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG;
    public static final int PVRTC2_2BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG;
    public static final int PVRTC2_4BPP_SRGB_BLOCK_IMG = VkFormat.VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG;
    public static final int G8B8G8R8_422_UNORM_KHR = VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM_KHR;
    public static final int B8G8R8G8_422_UNORM_KHR = VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM_KHR;
    public static final int G8_B8_R8_3PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR;
    public static final int G8_B8R8_2PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR;
    public static final int G8_B8_R8_3PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR;
    public static final int G8_B8R8_2PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR;
    public static final int G8_B8_R8_3PLANE_444_UNORM_KHR = VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR;
    public static final int R10X6_UNORM_PACK16_KHR = VkFormat.VK_FORMAT_R10X6_UNORM_PACK16_KHR;
    public static final int R10X6G10X6_UNORM_2PACK16_KHR = VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR;
    public static final int R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR;
    public static final int G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR;
    public static final int B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR;
    public static final int G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR;
    public static final int G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR;
    public static final int G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR;
    public static final int G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR;
    public static final int G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR;
    public static final int R12X4_UNORM_PACK16_KHR = VkFormat.VK_FORMAT_R12X4_UNORM_PACK16_KHR;
    public static final int R12X4G12X4_UNORM_2PACK16_KHR = VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR;
    public static final int R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR;
    public static final int G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR;
    public static final int B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR = VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR;
    public static final int G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR;
    public static final int G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR;
    public static final int G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR;
    public static final int G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR;
    public static final int G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR = VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR;
    public static final int G16B16G16R16_422_UNORM_KHR = VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM_KHR;
    public static final int B16G16R16G16_422_UNORM_KHR = VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM_KHR;
    public static final int G16_B16_R16_3PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR;
    public static final int G16_B16R16_2PLANE_420_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR;
    public static final int G16_B16_R16_3PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR;
    public static final int G16_B16R16_2PLANE_422_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR;
    public static final int G16_B16_R16_3PLANE_444_UNORM_KHR = VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR;

    public VulkanFormat(){
        super(new VkFormat());
    }

    public VulkanFormat(VkFormat vk){
        super(vk);
    }

    @Override
    public VkFormat getVk(){
        return (VkFormat) super.getVk();
    }

    public VulkanFormat(int value){
        super(new VkFormat(value));
    }

    @Override
    public String toString() {
        if(getValue() == UNDEFINED) return "UNDEFINED";
        if(getValue() == R4G4_UNORM_PACK8) return "R4G4_UNORM_PACK8";
        if(getValue() == R4G4B4A4_UNORM_PACK16) return "R4G4B4A4_UNORM_PACK16";
        if(getValue() == B4G4R4A4_UNORM_PACK16) return "B4G4R4A4_UNORM_PACK16";
        if(getValue() == R5G6B5_UNORM_PACK16) return "R5G6B5_UNORM_PACK16";
        if(getValue() == B5G6R5_UNORM_PACK16) return "B5G6R5_UNORM_PACK16";
        if(getValue() == R5G5B5A1_UNORM_PACK16) return "R5G5B5A1_UNORM_PACK16";
        if(getValue() == B5G5R5A1_UNORM_PACK16) return "B5G5R5A1_UNORM_PACK16";
        if(getValue() == A1R5G5B5_UNORM_PACK16) return "A1R5G5B5_UNORM_PACK16";
        if(getValue() == R8_UNORM) return "R8_UNORM";
        if(getValue() == R8_SNORM) return "R8_SNORM";
        if(getValue() == R8_USCALED) return "R8_USCALED";
        if(getValue() == R8_SSCALED) return "R8_SSCALED";
        if(getValue() == R8_UINT) return "R8_UINT";
        if(getValue() == R8_SINT) return "R8_SINT";
        if(getValue() == R8_SRGB) return "R8_SRGB";
        if(getValue() == R8G8_UNORM) return "R8G8_UNORM";
        if(getValue() == R8G8_SNORM) return "R8G8_SNORM";
        if(getValue() == R8G8_USCALED) return "R8G8_USCALED";
        if(getValue() == R8G8_SSCALED) return "R8G8_SSCALED";
        if(getValue() == R8G8_UINT) return "R8G8_UINT";
        if(getValue() == R8G8_SINT) return "R8G8_SINT";
        if(getValue() == R8G8_SRGB) return "R8G8_SRGB";
        if(getValue() == R8G8B8_UNORM) return "R8G8B8_UNORM";
        if(getValue() == R8G8B8_SNORM) return "R8G8B8_SNORM";
        if(getValue() == R8G8B8_USCALED) return "R8G8B8_USCALED";
        if(getValue() == R8G8B8_SSCALED) return "R8G8B8_SSCALED";
        if(getValue() == R8G8B8_UINT) return "R8G8B8_UINT";
        if(getValue() == R8G8B8_SINT) return "R8G8B8_SINT";
        if(getValue() == R8G8B8_SRGB) return "R8G8B8_SRGB";
        if(getValue() == B8G8R8_UNORM) return "B8G8R8_UNORM";
        if(getValue() == B8G8R8_SNORM) return "B8G8R8_SNORM";
        if(getValue() == B8G8R8_USCALED) return "B8G8R8_USCALED";
        if(getValue() == B8G8R8_SSCALED) return "B8G8R8_SSCALED";
        if(getValue() == B8G8R8_UINT) return "B8G8R8_UINT";
        if(getValue() == B8G8R8_SINT) return "B8G8R8_SINT";
        if(getValue() == B8G8R8_SRGB) return "B8G8R8_SRGB";
        if(getValue() == R8G8B8A8_UNORM) return "R8G8B8A8_UNORM";
        if(getValue() == R8G8B8A8_SNORM) return "R8G8B8A8_SNORM";
        if(getValue() == R8G8B8A8_USCALED) return "R8G8B8A8_USCALED";
        if(getValue() == R8G8B8A8_SSCALED) return "R8G8B8A8_SSCALED";
        if(getValue() == R8G8B8A8_UINT) return "R8G8B8A8_UINT";
        if(getValue() == R8G8B8A8_SINT) return "R8G8B8A8_SINT";
        if(getValue() == R8G8B8A8_SRGB) return "R8G8B8A8_SRGB";
        if(getValue() == B8G8R8A8_UNORM) return "B8G8R8A8_UNORM";
        if(getValue() == B8G8R8A8_SNORM) return "B8G8R8A8_SNORM";
        if(getValue() == B8G8R8A8_USCALED) return "B8G8R8A8_USCALED";
        if(getValue() == B8G8R8A8_SSCALED) return "B8G8R8A8_SSCALED";
        if(getValue() == B8G8R8A8_UINT) return "B8G8R8A8_UINT";
        if(getValue() == B8G8R8A8_SINT) return "B8G8R8A8_SINT";
        if(getValue() == B8G8R8A8_SRGB) return "B8G8R8A8_SRGB";
        if(getValue() == A8B8G8R8_UNORM_PACK32) return "A8B8G8R8_UNORM_PACK32";
        if(getValue() == A8B8G8R8_SNORM_PACK32) return "A8B8G8R8_SNORM_PACK32";
        if(getValue() == A8B8G8R8_USCALED_PACK32) return "A8B8G8R8_USCALED_PACK32";
        if(getValue() == A8B8G8R8_SSCALED_PACK32) return "A8B8G8R8_SSCALED_PACK32";
        if(getValue() == A8B8G8R8_UINT_PACK32) return "A8B8G8R8_UINT_PACK32";
        if(getValue() == A8B8G8R8_SINT_PACK32) return "A8B8G8R8_SINT_PACK32";
        if(getValue() == A8B8G8R8_SRGB_PACK32) return "A8B8G8R8_SRGB_PACK32";
        if(getValue() == A2R10G10B10_UNORM_PACK32) return "A2R10G10B10_UNORM_PACK32";
        if(getValue() == A2R10G10B10_SNORM_PACK32) return "A2R10G10B10_SNORM_PACK32";
        if(getValue() == A2R10G10B10_USCALED_PACK32) return "A2R10G10B10_USCALED_PACK32";
        if(getValue() == A2R10G10B10_SSCALED_PACK32) return "A2R10G10B10_SSCALED_PACK32";
        if(getValue() == A2R10G10B10_UINT_PACK32) return "A2R10G10B10_UINT_PACK32";
        if(getValue() == A2R10G10B10_SINT_PACK32) return "A2R10G10B10_SINT_PACK32";
        if(getValue() == A2B10G10R10_UNORM_PACK32) return "A2B10G10R10_UNORM_PACK32";
        if(getValue() == A2B10G10R10_SNORM_PACK32) return "A2B10G10R10_SNORM_PACK32";
        if(getValue() == A2B10G10R10_USCALED_PACK32) return "A2B10G10R10_USCALED_PACK32";
        if(getValue() == A2B10G10R10_SSCALED_PACK32) return "A2B10G10R10_SSCALED_PACK32";
        if(getValue() == A2B10G10R10_UINT_PACK32) return "A2B10G10R10_UINT_PACK32";
        if(getValue() == A2B10G10R10_SINT_PACK32) return "A2B10G10R10_SINT_PACK32";
        if(getValue() == R16_UNORM) return "R16_UNORM";
        if(getValue() == R16_SNORM) return "R16_SNORM";
        if(getValue() == R16_USCALED) return "R16_USCALED";
        if(getValue() == R16_SSCALED) return "R16_SSCALED";
        if(getValue() == R16_UINT) return "R16_UINT";
        if(getValue() == R16_SINT) return "R16_SINT";
        if(getValue() == R16_SFLOAT) return "R16_SFLOAT";
        if(getValue() == R16G16_UNORM) return "R16G16_UNORM";
        if(getValue() == R16G16_SNORM) return "R16G16_SNORM";
        if(getValue() == R16G16_USCALED) return "R16G16_USCALED";
        if(getValue() == R16G16_SSCALED) return "R16G16_SSCALED";
        if(getValue() == R16G16_UINT) return "R16G16_UINT";
        if(getValue() == R16G16_SINT) return "R16G16_SINT";
        if(getValue() == R16G16_SFLOAT) return "R16G16_SFLOAT";
        if(getValue() == R16G16B16_UNORM) return "R16G16B16_UNORM";
        if(getValue() == R16G16B16_SNORM) return "R16G16B16_SNORM";
        if(getValue() == R16G16B16_USCALED) return "R16G16B16_USCALED";
        if(getValue() == R16G16B16_SSCALED) return "R16G16B16_SSCALED";
        if(getValue() == R16G16B16_UINT) return "R16G16B16_UINT";
        if(getValue() == R16G16B16_SINT) return "R16G16B16_SINT";
        if(getValue() == R16G16B16_SFLOAT) return "R16G16B16_SFLOAT";
        if(getValue() == R16G16B16A16_UNORM) return "R16G16B16A16_UNORM";
        if(getValue() == R16G16B16A16_SNORM) return "R16G16B16A16_SNORM";
        if(getValue() == R16G16B16A16_USCALED) return "R16G16B16A16_USCALED";
        if(getValue() == R16G16B16A16_SSCALED) return "R16G16B16A16_SSCALED";
        if(getValue() == R16G16B16A16_UINT) return "R16G16B16A16_UINT";
        if(getValue() == R16G16B16A16_SINT) return "R16G16B16A16_SINT";
        if(getValue() == R16G16B16A16_SFLOAT) return "R16G16B16A16_SFLOAT";
        if(getValue() == R32_UINT) return "R32_UINT";
        if(getValue() == R32_SINT) return "R32_SINT";
        if(getValue() == R32_SFLOAT) return "R32_SFLOAT";
        if(getValue() == R32G32_UINT) return "R32G32_UINT";
        if(getValue() == R32G32_SINT) return "R32G32_SINT";
        if(getValue() == R32G32_SFLOAT) return "R32G32_SFLOAT";
        if(getValue() == R32G32B32_UINT) return "R32G32B32_UINT";
        if(getValue() == R32G32B32_SINT) return "R32G32B32_SINT";
        if(getValue() == R32G32B32_SFLOAT) return "R32G32B32_SFLOAT";
        if(getValue() == R32G32B32A32_UINT) return "R32G32B32A32_UINT";
        if(getValue() == R32G32B32A32_SINT) return "R32G32B32A32_SINT";
        if(getValue() == R32G32B32A32_SFLOAT) return "R32G32B32A32_SFLOAT";
        if(getValue() == R64_UINT) return "R64_UINT";
        if(getValue() == R64_SINT) return "R64_SINT";
        if(getValue() == R64_SFLOAT) return "R64_SFLOAT";
        if(getValue() == R64G64_UINT) return "R64G64_UINT";
        if(getValue() == R64G64_SINT) return "R64G64_SINT";
        if(getValue() == R64G64_SFLOAT) return "R64G64_SFLOAT";
        if(getValue() == R64G64B64_UINT) return "R64G64B64_UINT";
        if(getValue() == R64G64B64_SINT) return "R64G64B64_SINT";
        if(getValue() == R64G64B64_SFLOAT) return "R64G64B64_SFLOAT";
        if(getValue() == R64G64B64A64_UINT) return "R64G64B64A64_UINT";
        if(getValue() == R64G64B64A64_SINT) return "R64G64B64A64_SINT";
        if(getValue() == R64G64B64A64_SFLOAT) return "R64G64B64A64_SFLOAT";
        if(getValue() == B10G11R11_UFLOAT_PACK32) return "B10G11R11_UFLOAT_PACK32";
        if(getValue() == E5B9G9R9_UFLOAT_PACK32) return "E5B9G9R9_UFLOAT_PACK32";
        if(getValue() == D16_UNORM) return "D16_UNORM";
        if(getValue() == X8_D24_UNORM_PACK32) return "X8_D24_UNORM_PACK32";
        if(getValue() == D32_SFLOAT) return "D32_SFLOAT";
        if(getValue() == S8_UINT) return "S8_UINT";
        if(getValue() == D16_UNORM_S8_UINT) return "D16_UNORM_S8_UINT";
        if(getValue() == D24_UNORM_S8_UINT) return "D24_UNORM_S8_UINT";
        if(getValue() == D32_SFLOAT_S8_UINT) return "D32_SFLOAT_S8_UINT";
        if(getValue() == BC1_RGB_UNORM_BLOCK) return "BC1_RGB_UNORM_BLOCK";
        if(getValue() == BC1_RGB_SRGB_BLOCK) return "BC1_RGB_SRGB_BLOCK";
        if(getValue() == BC1_RGBA_UNORM_BLOCK) return "BC1_RGBA_UNORM_BLOCK";
        if(getValue() == BC1_RGBA_SRGB_BLOCK) return "BC1_RGBA_SRGB_BLOCK";
        if(getValue() == BC2_UNORM_BLOCK) return "BC2_UNORM_BLOCK";
        if(getValue() == BC2_SRGB_BLOCK) return "BC2_SRGB_BLOCK";
        if(getValue() == BC3_UNORM_BLOCK) return "BC3_UNORM_BLOCK";
        if(getValue() == BC3_SRGB_BLOCK) return "BC3_SRGB_BLOCK";
        if(getValue() == BC4_UNORM_BLOCK) return "BC4_UNORM_BLOCK";
        if(getValue() == BC4_SNORM_BLOCK) return "BC4_SNORM_BLOCK";
        if(getValue() == BC5_UNORM_BLOCK) return "BC5_UNORM_BLOCK";
        if(getValue() == BC5_SNORM_BLOCK) return "BC5_SNORM_BLOCK";
        if(getValue() == BC6H_UFLOAT_BLOCK) return "BC6H_UFLOAT_BLOCK";
        if(getValue() == BC6H_SFLOAT_BLOCK) return "BC6H_SFLOAT_BLOCK";
        if(getValue() == BC7_UNORM_BLOCK) return "BC7_UNORM_BLOCK";
        if(getValue() == BC7_SRGB_BLOCK) return "BC7_SRGB_BLOCK";
        if(getValue() == ETC2_R8G8B8_UNORM_BLOCK) return "ETC2_R8G8B8_UNORM_BLOCK";
        if(getValue() == ETC2_R8G8B8_SRGB_BLOCK) return "ETC2_R8G8B8_SRGB_BLOCK";
        if(getValue() == ETC2_R8G8B8A1_UNORM_BLOCK) return "ETC2_R8G8B8A1_UNORM_BLOCK";
        if(getValue() == ETC2_R8G8B8A1_SRGB_BLOCK) return "ETC2_R8G8B8A1_SRGB_BLOCK";
        if(getValue() == ETC2_R8G8B8A8_UNORM_BLOCK) return "ETC2_R8G8B8A8_UNORM_BLOCK";
        if(getValue() == ETC2_R8G8B8A8_SRGB_BLOCK) return "ETC2_R8G8B8A8_SRGB_BLOCK";
        if(getValue() == EAC_R11_UNORM_BLOCK) return "EAC_R11_UNORM_BLOCK";
        if(getValue() == EAC_R11_SNORM_BLOCK) return "EAC_R11_SNORM_BLOCK";
        if(getValue() == EAC_R11G11_UNORM_BLOCK) return "EAC_R11G11_UNORM_BLOCK";
        if(getValue() == EAC_R11G11_SNORM_BLOCK) return "EAC_R11G11_SNORM_BLOCK";
        if(getValue() == ASTC_4x4_UNORM_BLOCK) return "ASTC_4x4_UNORM_BLOCK";
        if(getValue() == ASTC_4x4_SRGB_BLOCK) return "ASTC_4x4_SRGB_BLOCK";
        if(getValue() == ASTC_5x4_UNORM_BLOCK) return "ASTC_5x4_UNORM_BLOCK";
        if(getValue() == ASTC_5x4_SRGB_BLOCK) return "ASTC_5x4_SRGB_BLOCK";
        if(getValue() == ASTC_5x5_UNORM_BLOCK) return "ASTC_5x5_UNORM_BLOCK";
        if(getValue() == ASTC_5x5_SRGB_BLOCK) return "ASTC_5x5_SRGB_BLOCK";
        if(getValue() == ASTC_6x5_UNORM_BLOCK) return "ASTC_6x5_UNORM_BLOCK";
        if(getValue() == ASTC_6x5_SRGB_BLOCK) return "ASTC_6x5_SRGB_BLOCK";
        if(getValue() == ASTC_6x6_UNORM_BLOCK) return "ASTC_6x6_UNORM_BLOCK";
        if(getValue() == ASTC_6x6_SRGB_BLOCK) return "ASTC_6x6_SRGB_BLOCK";
        if(getValue() == ASTC_8x5_UNORM_BLOCK) return "ASTC_8x5_UNORM_BLOCK";
        if(getValue() == ASTC_8x5_SRGB_BLOCK) return "ASTC_8x5_SRGB_BLOCK";
        if(getValue() == ASTC_8x6_UNORM_BLOCK) return "ASTC_8x6_UNORM_BLOCK";
        if(getValue() == ASTC_8x6_SRGB_BLOCK) return "ASTC_8x6_SRGB_BLOCK";
        if(getValue() == ASTC_8x8_UNORM_BLOCK) return "ASTC_8x8_UNORM_BLOCK";
        if(getValue() == ASTC_8x8_SRGB_BLOCK) return "ASTC_8x8_SRGB_BLOCK";
        if(getValue() == ASTC_10x5_UNORM_BLOCK) return "ASTC_10x5_UNORM_BLOCK";
        if(getValue() == ASTC_10x5_SRGB_BLOCK) return "ASTC_10x5_SRGB_BLOCK";
        if(getValue() == ASTC_10x6_UNORM_BLOCK) return "ASTC_10x6_UNORM_BLOCK";
        if(getValue() == ASTC_10x6_SRGB_BLOCK) return "ASTC_10x6_SRGB_BLOCK";
        if(getValue() == ASTC_10x8_UNORM_BLOCK) return "ASTC_10x8_UNORM_BLOCK";
        if(getValue() == ASTC_10x8_SRGB_BLOCK) return "ASTC_10x8_SRGB_BLOCK";
        if(getValue() == ASTC_10x10_UNORM_BLOCK) return "ASTC_10x10_UNORM_BLOCK";
        if(getValue() == ASTC_10x10_SRGB_BLOCK) return "ASTC_10x10_SRGB_BLOCK";
        if(getValue() == ASTC_12x10_UNORM_BLOCK) return "ASTC_12x10_UNORM_BLOCK";
        if(getValue() == ASTC_12x10_SRGB_BLOCK) return "ASTC_12x10_SRGB_BLOCK";
        if(getValue() == ASTC_12x12_UNORM_BLOCK) return "ASTC_12x12_UNORM_BLOCK";
        if(getValue() == ASTC_12x12_SRGB_BLOCK) return "ASTC_12x12_SRGB_BLOCK";
        if(getValue() == G8B8G8R8_422_UNORM) return "G8B8G8R8_422_UNORM";
        if(getValue() == B8G8R8G8_422_UNORM) return "B8G8R8G8_422_UNORM";
        if(getValue() == G8_B8_R8_3PLANE_420_UNORM) return "G8_B8_R8_3PLANE_420_UNORM";
        if(getValue() == G8_B8R8_2PLANE_420_UNORM) return "G8_B8R8_2PLANE_420_UNORM";
        if(getValue() == G8_B8_R8_3PLANE_422_UNORM) return "G8_B8_R8_3PLANE_422_UNORM";
        if(getValue() == G8_B8R8_2PLANE_422_UNORM) return "G8_B8R8_2PLANE_422_UNORM";
        if(getValue() == G8_B8_R8_3PLANE_444_UNORM) return "G8_B8_R8_3PLANE_444_UNORM";
        if(getValue() == R10X6_UNORM_PACK16) return "R10X6_UNORM_PACK16";
        if(getValue() == R10X6G10X6_UNORM_2PACK16) return "R10X6G10X6_UNORM_2PACK16";
        if(getValue() == R10X6G10X6B10X6A10X6_UNORM_4PACK16) return "R10X6G10X6B10X6A10X6_UNORM_4PACK16";
        if(getValue() == G10X6B10X6G10X6R10X6_422_UNORM_4PACK16) return "G10X6B10X6G10X6R10X6_422_UNORM_4PACK16";
        if(getValue() == B10X6G10X6R10X6G10X6_422_UNORM_4PACK16) return "B10X6G10X6R10X6G10X6_422_UNORM_4PACK16";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16) return "G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16";
        if(getValue() == G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16) return "G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16) return "G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16";
        if(getValue() == G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16) return "G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16) return "G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16";
        if(getValue() == R12X4_UNORM_PACK16) return "R12X4_UNORM_PACK16";
        if(getValue() == R12X4G12X4_UNORM_2PACK16) return "R12X4G12X4_UNORM_2PACK16";
        if(getValue() == R12X4G12X4B12X4A12X4_UNORM_4PACK16) return "R12X4G12X4B12X4A12X4_UNORM_4PACK16";
        if(getValue() == G12X4B12X4G12X4R12X4_422_UNORM_4PACK16) return "G12X4B12X4G12X4R12X4_422_UNORM_4PACK16";
        if(getValue() == B12X4G12X4R12X4G12X4_422_UNORM_4PACK16) return "B12X4G12X4R12X4G12X4_422_UNORM_4PACK16";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16) return "G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16";
        if(getValue() == G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16) return "G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16) return "G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16";
        if(getValue() == G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16) return "G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16) return "G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16";
        if(getValue() == G16B16G16R16_422_UNORM) return "G16B16G16R16_422_UNORM";
        if(getValue() == B16G16R16G16_422_UNORM) return "B16G16R16G16_422_UNORM";
        if(getValue() == G16_B16_R16_3PLANE_420_UNORM) return "G16_B16_R16_3PLANE_420_UNORM";
        if(getValue() == G16_B16R16_2PLANE_420_UNORM) return "G16_B16R16_2PLANE_420_UNORM";
        if(getValue() == G16_B16_R16_3PLANE_422_UNORM) return "G16_B16_R16_3PLANE_422_UNORM";
        if(getValue() == G16_B16R16_2PLANE_422_UNORM) return "G16_B16R16_2PLANE_422_UNORM";
        if(getValue() == G16_B16_R16_3PLANE_444_UNORM) return "G16_B16_R16_3PLANE_444_UNORM";
        if(getValue() == PVRTC1_2BPP_UNORM_BLOCK_IMG) return "PVRTC1_2BPP_UNORM_BLOCK_IMG";
        if(getValue() == PVRTC1_4BPP_UNORM_BLOCK_IMG) return "PVRTC1_4BPP_UNORM_BLOCK_IMG";
        if(getValue() == PVRTC2_2BPP_UNORM_BLOCK_IMG) return "PVRTC2_2BPP_UNORM_BLOCK_IMG";
        if(getValue() == PVRTC2_4BPP_UNORM_BLOCK_IMG) return "PVRTC2_4BPP_UNORM_BLOCK_IMG";
        if(getValue() == PVRTC1_2BPP_SRGB_BLOCK_IMG) return "PVRTC1_2BPP_SRGB_BLOCK_IMG";
        if(getValue() == PVRTC1_4BPP_SRGB_BLOCK_IMG) return "PVRTC1_4BPP_SRGB_BLOCK_IMG";
        if(getValue() == PVRTC2_2BPP_SRGB_BLOCK_IMG) return "PVRTC2_2BPP_SRGB_BLOCK_IMG";
        if(getValue() == PVRTC2_4BPP_SRGB_BLOCK_IMG) return "PVRTC2_4BPP_SRGB_BLOCK_IMG";
        if(getValue() == G8B8G8R8_422_UNORM_KHR) return "G8B8G8R8_422_UNORM_KHR";
        if(getValue() == B8G8R8G8_422_UNORM_KHR) return "B8G8R8G8_422_UNORM_KHR";
        if(getValue() == G8_B8_R8_3PLANE_420_UNORM_KHR) return "G8_B8_R8_3PLANE_420_UNORM_KHR";
        if(getValue() == G8_B8R8_2PLANE_420_UNORM_KHR) return "G8_B8R8_2PLANE_420_UNORM_KHR";
        if(getValue() == G8_B8_R8_3PLANE_422_UNORM_KHR) return "G8_B8_R8_3PLANE_422_UNORM_KHR";
        if(getValue() == G8_B8R8_2PLANE_422_UNORM_KHR) return "G8_B8R8_2PLANE_422_UNORM_KHR";
        if(getValue() == G8_B8_R8_3PLANE_444_UNORM_KHR) return "G8_B8_R8_3PLANE_444_UNORM_KHR";
        if(getValue() == R10X6_UNORM_PACK16_KHR) return "R10X6_UNORM_PACK16_KHR";
        if(getValue() == R10X6G10X6_UNORM_2PACK16_KHR) return "R10X6G10X6_UNORM_2PACK16_KHR";
        if(getValue() == R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR) return "R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR";
        if(getValue() == G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR) return "G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR";
        if(getValue() == B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR) return "B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR) return "G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR";
        if(getValue() == G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR) return "G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR) return "G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR";
        if(getValue() == G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR) return "G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR";
        if(getValue() == G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR) return "G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR";
        if(getValue() == R12X4_UNORM_PACK16_KHR) return "R12X4_UNORM_PACK16_KHR";
        if(getValue() == R12X4G12X4_UNORM_2PACK16_KHR) return "R12X4G12X4_UNORM_2PACK16_KHR";
        if(getValue() == R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR) return "R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR";
        if(getValue() == G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR) return "G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR";
        if(getValue() == B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR) return "B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR) return "G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR";
        if(getValue() == G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR) return "G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR) return "G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR";
        if(getValue() == G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR) return "G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR";
        if(getValue() == G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR) return "G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR";
        if(getValue() == G16B16G16R16_422_UNORM_KHR) return "G16B16G16R16_422_UNORM_KHR";
        if(getValue() == B16G16R16G16_422_UNORM_KHR) return "B16G16R16G16_422_UNORM_KHR";
        if(getValue() == G16_B16_R16_3PLANE_420_UNORM_KHR) return "G16_B16_R16_3PLANE_420_UNORM_KHR";
        if(getValue() == G16_B16R16_2PLANE_420_UNORM_KHR) return "G16_B16R16_2PLANE_420_UNORM_KHR";
        if(getValue() == G16_B16_R16_3PLANE_422_UNORM_KHR) return "G16_B16_R16_3PLANE_422_UNORM_KHR";
        if(getValue() == G16_B16R16_2PLANE_422_UNORM_KHR) return "G16_B16R16_2PLANE_422_UNORM_KHR";
        if(getValue() == G16_B16_R16_3PLANE_444_UNORM_KHR) return "G16_B16_R16_3PLANE_444_UNORM_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanFormat implements cz.mg.collections.array.ReadonlyArray<VulkanFormat> {
        public Array(VkFormat.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFormat.Array(count));
        }

        public Array(int count, VulkanFormat o){
            this(new VkFormat.Array(count, o.getVk()));
        }

        @Override
        public VkFormat.Array getVk(){
            return (VkFormat.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFormat get(int i){
            return new VulkanFormat(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFormat.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFormat.Pointer());
        }

        public Pointer(long value) {
            this(new VkFormat.Pointer(value));
        }

        @Override
        public VkFormat.Pointer getVk(){
            return (VkFormat.Pointer) super.getVk();
        }

        public static class Array extends VulkanFormat.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFormat.Pointer> {
            public Array(int count) {
                super(new VkFormat.Pointer.Array(count));
            }

            public Array(VulkanFormat[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFormat.Pointer.Array getVk(){
                return (VkFormat.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFormat.Pointer get(int i){
                return new VulkanFormat.Pointer(getVk().get(i));
            }
        }
    }
}
