package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSharingMode.html">khronos documentation</a>
 **/
public class VulkanSharingMode extends VulkanEnum {
    public static final int EXCLUSIVE = VkSharingMode.VK_SHARING_MODE_EXCLUSIVE;
    public static final int CONCURRENT = VkSharingMode.VK_SHARING_MODE_CONCURRENT;

    public VulkanSharingMode(){
        super(new VkSharingMode());
    }

    public VulkanSharingMode(VkSharingMode vk){
        super(vk);
    }

    @Override
    public VkSharingMode getVk(){
        return (VkSharingMode) super.getVk();
    }

    public VulkanSharingMode(int value){
        super(new VkSharingMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == EXCLUSIVE) return "EXCLUSIVE";
        if(getValue() == CONCURRENT) return "CONCURRENT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanSharingMode implements cz.mg.collections.array.ReadonlyArray<VulkanSharingMode> {
        public Array(VkSharingMode.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSharingMode.Array(count));
        }

        public Array(int count, VulkanSharingMode o){
            this(new VkSharingMode.Array(count, o.getVk()));
        }

        @Override
        public VkSharingMode.Array getVk(){
            return (VkSharingMode.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSharingMode get(int i){
            return new VulkanSharingMode(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSharingMode.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSharingMode.Pointer());
        }

        public Pointer(long value) {
            this(new VkSharingMode.Pointer(value));
        }

        @Override
        public VkSharingMode.Pointer getVk(){
            return (VkSharingMode.Pointer) super.getVk();
        }

        public static class Array extends VulkanSharingMode.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSharingMode.Pointer> {
            public Array(int count) {
                super(new VkSharingMode.Pointer.Array(count));
            }

            public Array(VulkanSharingMode[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSharingMode.Pointer.Array getVk(){
                return (VkSharingMode.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSharingMode.Pointer get(int i){
                return new VulkanSharingMode.Pointer(getVk().get(i));
            }
        }
    }
}
