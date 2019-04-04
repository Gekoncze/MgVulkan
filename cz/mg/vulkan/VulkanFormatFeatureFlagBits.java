package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanFormatFeatureFlagBits extends VulkanFlagBits {
    public static final int SAMPLED_IMAGE = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT;
    public static final int STORAGE_IMAGE = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT;
    public static final int STORAGE_IMAGE_ATOMIC = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT;
    public static final int UNIFORM_TEXEL_BUFFER = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT;
    public static final int STORAGE_TEXEL_BUFFER = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT;
    public static final int STORAGE_TEXEL_BUFFER_ATOMIC = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT;
    public static final int VERTEX_BUFFER = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT;
    public static final int COLOR_ATTACHMENT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT;
    public static final int COLOR_ATTACHMENT_BLEND = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int BLIT_SRC = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_SRC_BIT;
    public static final int BLIT_DST = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_DST_BIT;
    public static final int SAMPLED_IMAGE_FILTER_LINEAR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT;
    public static final int TRANSFER_SRC = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT;
    public static final int TRANSFER_DST = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT;
    public static final int MIDPOINT_CHROMA_SAMPLES = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT;
    public static final int DISJOINT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT;
    public static final int COSITED_CHROMA_SAMPLES = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT;
    public static final int SAMPLED_IMAGE_FILTER_CUBIC_IMG = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG;
    public static final int SAMPLED_IMAGE_FILTER_MINMAX_EXT = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT;
    public static final int TRANSFER_SRC_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR;
    public static final int TRANSFER_DST_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR;
    public static final int MIDPOINT_CHROMA_SAMPLES_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR;
    public static final int SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR;
    public static final int DISJOINT_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT_KHR;
    public static final int COSITED_CHROMA_SAMPLES_KHR = VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR;

    public VulkanFormatFeatureFlagBits(){
        super(new VkFormatFeatureFlagBits());
    }

    public VulkanFormatFeatureFlagBits(VkFormatFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkFormatFeatureFlagBits getVk(){
        return (VkFormatFeatureFlagBits) super.getVk();
    }

    public VulkanFormatFeatureFlagBits(int value){
        super(new VkFormatFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SAMPLED_IMAGE) s += "SAMPLED_IMAGE";
        if(getValue() == STORAGE_IMAGE) s += "STORAGE_IMAGE";
        if(getValue() == STORAGE_IMAGE_ATOMIC) s += "STORAGE_IMAGE_ATOMIC";
        if(getValue() == UNIFORM_TEXEL_BUFFER) s += "UNIFORM_TEXEL_BUFFER";
        if(getValue() == STORAGE_TEXEL_BUFFER) s += "STORAGE_TEXEL_BUFFER";
        if(getValue() == STORAGE_TEXEL_BUFFER_ATOMIC) s += "STORAGE_TEXEL_BUFFER_ATOMIC";
        if(getValue() == VERTEX_BUFFER) s += "VERTEX_BUFFER";
        if(getValue() == COLOR_ATTACHMENT) s += "COLOR_ATTACHMENT";
        if(getValue() == COLOR_ATTACHMENT_BLEND) s += "COLOR_ATTACHMENT_BLEND";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT) s += "DEPTH_STENCIL_ATTACHMENT";
        if(getValue() == BLIT_SRC) s += "BLIT_SRC";
        if(getValue() == BLIT_DST) s += "BLIT_DST";
        if(getValue() == SAMPLED_IMAGE_FILTER_LINEAR) s += "SAMPLED_IMAGE_FILTER_LINEAR";
        if(getValue() == TRANSFER_SRC) s += "TRANSFER_SRC";
        if(getValue() == TRANSFER_DST) s += "TRANSFER_DST";
        if(getValue() == MIDPOINT_CHROMA_SAMPLES) s += "MIDPOINT_CHROMA_SAMPLES";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE";
        if(getValue() == DISJOINT) s += "DISJOINT";
        if(getValue() == COSITED_CHROMA_SAMPLES) s += "COSITED_CHROMA_SAMPLES";
        if(getValue() == SAMPLED_IMAGE_FILTER_CUBIC_IMG) s += "SAMPLED_IMAGE_FILTER_CUBIC_IMG";
        if(getValue() == SAMPLED_IMAGE_FILTER_MINMAX_EXT) s += "SAMPLED_IMAGE_FILTER_MINMAX_EXT";
        if(getValue() == TRANSFER_SRC_KHR) s += "TRANSFER_SRC_KHR";
        if(getValue() == TRANSFER_DST_KHR) s += "TRANSFER_DST_KHR";
        if(getValue() == MIDPOINT_CHROMA_SAMPLES_KHR) s += "MIDPOINT_CHROMA_SAMPLES_KHR";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR";
        if(getValue() == SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR) s += "SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR";
        if(getValue() == DISJOINT_KHR) s += "DISJOINT_KHR";
        if(getValue() == COSITED_CHROMA_SAMPLES_KHR) s += "COSITED_CHROMA_SAMPLES_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanFormatFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanFormatFeatureFlagBits> {
        public Array(VkFormatFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFormatFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanFormatFeatureFlagBits o){
            this(new VkFormatFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkFormatFeatureFlagBits.Array getVk(){
            return (VkFormatFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFormatFeatureFlagBits get(int i){
            return new VulkanFormatFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFormatFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFormatFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkFormatFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkFormatFeatureFlagBits.Pointer getVk(){
            return (VkFormatFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanFormatFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFormatFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkFormatFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanFormatFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFormatFeatureFlagBits.Pointer.Array getVk(){
                return (VkFormatFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFormatFeatureFlagBits.Pointer get(int i){
                return new VulkanFormatFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
