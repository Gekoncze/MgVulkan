package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkConservativeRasterizationModeEXT.html">khronos documentation</a>
 **/
public class VulkanConservativeRasterizationModeEXT extends VulkanEnum {
    public static final int CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT;
    public static final int CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT;
    public static final int CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT;

    public VulkanConservativeRasterizationModeEXT(){
        super(new VkConservativeRasterizationModeEXT());
    }

    public VulkanConservativeRasterizationModeEXT(VkConservativeRasterizationModeEXT vk){
        super(vk);
    }

    @Override
    public VkConservativeRasterizationModeEXT getVk(){
        return (VkConservativeRasterizationModeEXT) super.getVk();
    }

    public VulkanConservativeRasterizationModeEXT(int value){
        super(new VkConservativeRasterizationModeEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
        if(getValue() == CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT) return "CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanConservativeRasterizationModeEXT implements cz.mg.collections.array.ReadonlyArray<VulkanConservativeRasterizationModeEXT> {
        public Array(VkConservativeRasterizationModeEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkConservativeRasterizationModeEXT.Array(count));
        }

        public Array(int count, VulkanConservativeRasterizationModeEXT o){
            this(new VkConservativeRasterizationModeEXT.Array(count, o.getVk()));
        }

        @Override
        public VkConservativeRasterizationModeEXT.Array getVk(){
            return (VkConservativeRasterizationModeEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanConservativeRasterizationModeEXT get(int i){
            return new VulkanConservativeRasterizationModeEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkConservativeRasterizationModeEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkConservativeRasterizationModeEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkConservativeRasterizationModeEXT.Pointer(value));
        }

        @Override
        public VkConservativeRasterizationModeEXT.Pointer getVk(){
            return (VkConservativeRasterizationModeEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanConservativeRasterizationModeEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanConservativeRasterizationModeEXT.Pointer> {
            public Array(int count) {
                super(new VkConservativeRasterizationModeEXT.Pointer.Array(count));
            }

            public Array(VulkanConservativeRasterizationModeEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkConservativeRasterizationModeEXT.Pointer.Array getVk(){
                return (VkConservativeRasterizationModeEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanConservativeRasterizationModeEXT.Pointer get(int i){
                return new VulkanConservativeRasterizationModeEXT.Pointer(getVk().get(i));
            }
        }
    }
}
