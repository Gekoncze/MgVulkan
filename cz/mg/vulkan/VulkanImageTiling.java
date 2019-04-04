package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageTiling.html">khronos documentation</a>
 **/
public class VulkanImageTiling extends VulkanEnum {
    public static final int OPTIMAL = VkImageTiling.VK_IMAGE_TILING_OPTIMAL;
    public static final int LINEAR = VkImageTiling.VK_IMAGE_TILING_LINEAR;

    public VulkanImageTiling(){
        super(new VkImageTiling());
    }

    public VulkanImageTiling(VkImageTiling vk){
        super(vk);
    }

    @Override
    public VkImageTiling getVk(){
        return (VkImageTiling) super.getVk();
    }

    public VulkanImageTiling(int value){
        super(new VkImageTiling(value));
    }

    @Override
    public String toString() {
        if(getValue() == OPTIMAL) return "OPTIMAL";
        if(getValue() == LINEAR) return "LINEAR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanImageTiling implements cz.mg.collections.array.ReadonlyArray<VulkanImageTiling> {
        public Array(VkImageTiling.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageTiling.Array(count));
        }

        public Array(int count, VulkanImageTiling o){
            this(new VkImageTiling.Array(count, o.getVk()));
        }

        @Override
        public VkImageTiling.Array getVk(){
            return (VkImageTiling.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageTiling get(int i){
            return new VulkanImageTiling(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageTiling.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageTiling.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageTiling.Pointer(value));
        }

        @Override
        public VkImageTiling.Pointer getVk(){
            return (VkImageTiling.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageTiling.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageTiling.Pointer> {
            public Array(int count) {
                super(new VkImageTiling.Pointer.Array(count));
            }

            public Array(VulkanImageTiling[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageTiling.Pointer.Array getVk(){
                return (VkImageTiling.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageTiling.Pointer get(int i){
                return new VulkanImageTiling.Pointer(getVk().get(i));
            }
        }
    }
}
