package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanImageCreateFlagBits extends VulkanFlagBits {
    public static final int SPARSE_BINDING = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_BINDING_BIT;
    public static final int SPARSE_RESIDENCY = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int SPARSE_ALIASED = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_ALIASED_BIT;
    public static final int MUTABLE_FORMAT = VkImageCreateFlagBits.VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT;
    public static final int CUBE_COMPATIBLE = VkImageCreateFlagBits.VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT;
    public static final int ALIAS = VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT;
    public static final int SPLIT_INSTANCE_BIND_REGIONS = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT;
    public static final int D2_ARRAY_COMPATIBLE = VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT;
    public static final int BLOCK_TEXEL_VIEW_COMPATIBLE = VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT;
    public static final int EXTENDED_USAGE = VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT;
    public static final int PROTECTED = VkImageCreateFlagBits.VK_IMAGE_CREATE_PROTECTED_BIT;
    public static final int DISJOINT = VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT;
    public static final int SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT = VkImageCreateFlagBits.VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT;
    public static final int SPLIT_INSTANCE_BIND_REGIONS_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int D2_ARRAY_COMPATIBLE_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR;
    public static final int BLOCK_TEXEL_VIEW_COMPATIBLE_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR;
    public static final int EXTENDED_USAGE_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR;
    public static final int DISJOINT_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT_KHR;
    public static final int ALIAS_KHR = VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT_KHR;

    public VulkanImageCreateFlagBits(){
        super(new VkImageCreateFlagBits());
    }

    public VulkanImageCreateFlagBits(VkImageCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkImageCreateFlagBits getVk(){
        return (VkImageCreateFlagBits) super.getVk();
    }

    public VulkanImageCreateFlagBits(int value){
        super(new VkImageCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SPARSE_BINDING) s += "SPARSE_BINDING";
        if(getValue() == SPARSE_RESIDENCY) s += "SPARSE_RESIDENCY";
        if(getValue() == SPARSE_ALIASED) s += "SPARSE_ALIASED";
        if(getValue() == MUTABLE_FORMAT) s += "MUTABLE_FORMAT";
        if(getValue() == CUBE_COMPATIBLE) s += "CUBE_COMPATIBLE";
        if(getValue() == ALIAS) s += "ALIAS";
        if(getValue() == SPLIT_INSTANCE_BIND_REGIONS) s += "SPLIT_INSTANCE_BIND_REGIONS";
        if(getValue() == D2_ARRAY_COMPATIBLE) s += "D2_ARRAY_COMPATIBLE";
        if(getValue() == BLOCK_TEXEL_VIEW_COMPATIBLE) s += "BLOCK_TEXEL_VIEW_COMPATIBLE";
        if(getValue() == EXTENDED_USAGE) s += "EXTENDED_USAGE";
        if(getValue() == PROTECTED) s += "PROTECTED";
        if(getValue() == DISJOINT) s += "DISJOINT";
        if(getValue() == SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT) s += "SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT";
        if(getValue() == SPLIT_INSTANCE_BIND_REGIONS_KHR) s += "SPLIT_INSTANCE_BIND_REGIONS_KHR";
        if(getValue() == D2_ARRAY_COMPATIBLE_KHR) s += "D2_ARRAY_COMPATIBLE_KHR";
        if(getValue() == BLOCK_TEXEL_VIEW_COMPATIBLE_KHR) s += "BLOCK_TEXEL_VIEW_COMPATIBLE_KHR";
        if(getValue() == EXTENDED_USAGE_KHR) s += "EXTENDED_USAGE_KHR";
        if(getValue() == DISJOINT_KHR) s += "DISJOINT_KHR";
        if(getValue() == ALIAS_KHR) s += "ALIAS_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanImageCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateFlagBits> {
        public Array(VkImageCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanImageCreateFlagBits o){
            this(new VkImageCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkImageCreateFlagBits.Array getVk(){
            return (VkImageCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageCreateFlagBits get(int i){
            return new VulkanImageCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageCreateFlagBits.Pointer(value));
        }

        @Override
        public VkImageCreateFlagBits.Pointer getVk(){
            return (VkImageCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkImageCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanImageCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageCreateFlagBits.Pointer.Array getVk(){
                return (VkImageCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageCreateFlagBits.Pointer get(int i){
                return new VulkanImageCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
