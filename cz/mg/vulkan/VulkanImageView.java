package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageView.html">khronos documentation</a>
 **/
public class VulkanImageView extends VulkanHandle {
    public VulkanImageView(){
        super(new VkImageView());
    }

    public VulkanImageView(VkImageView vk){
        super(vk);
    }

    @Override
    public VkImageView getVk(){
        return (VkImageView) super.getVk();
    }

    public VulkanImageView(int value){
        super(new VkImageView(value));
    }

    public static class Array extends VulkanImageView implements cz.mg.collections.array.ReadonlyArray<VulkanImageView> {
        public Array(VkImageView.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageView.Array(count));
        }

        public Array(int count, VulkanImageView o){
            this(new VkImageView.Array(count, o.getVk()));
        }

        @Override
        public VkImageView.Array getVk(){
            return (VkImageView.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageView get(int i){
            return new VulkanImageView(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageView.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageView.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageView.Pointer(value));
        }

        @Override
        public VkImageView.Pointer getVk(){
            return (VkImageView.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageView.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageView.Pointer> {
            public Array(int count) {
                super(new VkImageView.Pointer.Array(count));
            }

            public Array(VulkanImageView[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageView.Pointer.Array getVk(){
                return (VkImageView.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageView.Pointer get(int i){
                return new VulkanImageView.Pointer(getVk().get(i));
            }
        }
    }
}
