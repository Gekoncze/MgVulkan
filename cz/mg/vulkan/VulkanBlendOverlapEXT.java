package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBlendOverlapEXT.html">khronos documentation</a>
 **/
public class VulkanBlendOverlapEXT extends VulkanEnum {
    public static final int BLEND_OVERLAP_UNCORRELATED_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_UNCORRELATED_EXT;
    public static final int BLEND_OVERLAP_DISJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_DISJOINT_EXT;
    public static final int BLEND_OVERLAP_CONJOINT_EXT = VkBlendOverlapEXT.VK_BLEND_OVERLAP_CONJOINT_EXT;

    public VulkanBlendOverlapEXT(){
        super(new VkBlendOverlapEXT());
    }

    public VulkanBlendOverlapEXT(VkBlendOverlapEXT vk){
        super(vk);
    }

    @Override
    public VkBlendOverlapEXT getVk(){
        return (VkBlendOverlapEXT) super.getVk();
    }

    public VulkanBlendOverlapEXT(int value){
        super(new VkBlendOverlapEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == BLEND_OVERLAP_UNCORRELATED_EXT) return "BLEND_OVERLAP_UNCORRELATED_EXT";
        if(getValue() == BLEND_OVERLAP_DISJOINT_EXT) return "BLEND_OVERLAP_DISJOINT_EXT";
        if(getValue() == BLEND_OVERLAP_CONJOINT_EXT) return "BLEND_OVERLAP_CONJOINT_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanBlendOverlapEXT implements cz.mg.collections.array.ReadonlyArray<VulkanBlendOverlapEXT> {
        public Array(VkBlendOverlapEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBlendOverlapEXT.Array(count));
        }

        public Array(int count, VulkanBlendOverlapEXT o){
            this(new VkBlendOverlapEXT.Array(count, o.getVk()));
        }

        @Override
        public VkBlendOverlapEXT.Array getVk(){
            return (VkBlendOverlapEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBlendOverlapEXT get(int i){
            return new VulkanBlendOverlapEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBlendOverlapEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBlendOverlapEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkBlendOverlapEXT.Pointer(value));
        }

        @Override
        public VkBlendOverlapEXT.Pointer getVk(){
            return (VkBlendOverlapEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanBlendOverlapEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBlendOverlapEXT.Pointer> {
            public Array(int count) {
                super(new VkBlendOverlapEXT.Pointer.Array(count));
            }

            public Array(VulkanBlendOverlapEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBlendOverlapEXT.Pointer.Array getVk(){
                return (VkBlendOverlapEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBlendOverlapEXT.Pointer get(int i){
                return new VulkanBlendOverlapEXT.Pointer(getVk().get(i));
            }
        }
    }
}
