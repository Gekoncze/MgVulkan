package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImage.html">khronos documentation</a>
 **/
public class VulkanImage extends VulkanHandle {
    public VulkanImage(){
        super(new VkImage());
    }

    public VulkanImage(VkImage vk){
        super(vk);
    }

    @Override
    public VkImage getVk(){
        return (VkImage) super.getVk();
    }

    public VulkanImage(int value){
        super(new VkImage(value));
    }

    public static class Array extends VulkanImage implements cz.mg.collections.array.ReadonlyArray<VulkanImage> {
        public Array(VkImage.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImage.Array(count));
        }

        public Array(int count, VulkanImage o){
            this(new VkImage.Array(count, o.getVk()));
        }

        @Override
        public VkImage.Array getVk(){
            return (VkImage.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImage get(int i){
            return new VulkanImage(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImage.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImage.Pointer());
        }

        public Pointer(long value) {
            this(new VkImage.Pointer(value));
        }

        @Override
        public VkImage.Pointer getVk(){
            return (VkImage.Pointer) super.getVk();
        }

        public static class Array extends VulkanImage.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImage.Pointer> {
            public Array(int count) {
                super(new VkImage.Pointer.Array(count));
            }

            public Array(VulkanImage[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImage.Pointer.Array getVk(){
                return (VkImage.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImage.Pointer get(int i){
                return new VulkanImage.Pointer(getVk().get(i));
            }
        }
    }
}
