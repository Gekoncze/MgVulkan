package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreCreateFlags.html">khronos documentation</a>
 **/
public class VulkanSemaphoreCreateFlags extends VulkanFlags {
    public VulkanSemaphoreCreateFlags(){
        super(new VkSemaphoreCreateFlags());
    }

    public VulkanSemaphoreCreateFlags(VkSemaphoreCreateFlags vk){
        super(vk);
    }

    @Override
    public VkSemaphoreCreateFlags getVk(){
        return (VkSemaphoreCreateFlags) super.getVk();
    }

    public VulkanSemaphoreCreateFlags(int value){
        super(new VkSemaphoreCreateFlags(value));
    }

    public static class Array extends VulkanSemaphoreCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreCreateFlags> {
        public Array(VkSemaphoreCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphoreCreateFlags.Array(count));
        }

        public Array(int count, VulkanSemaphoreCreateFlags o){
            this(new VkSemaphoreCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphoreCreateFlags.Array getVk(){
            return (VkSemaphoreCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphoreCreateFlags get(int i){
            return new VulkanSemaphoreCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphoreCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphoreCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphoreCreateFlags.Pointer(value));
        }

        @Override
        public VkSemaphoreCreateFlags.Pointer getVk(){
            return (VkSemaphoreCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphoreCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkSemaphoreCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanSemaphoreCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphoreCreateFlags.Pointer.Array getVk(){
                return (VkSemaphoreCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphoreCreateFlags.Pointer get(int i){
                return new VulkanSemaphoreCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
