package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDevice.html">khronos documentation</a>
 **/
public class VulkanDevice extends VulkanHandle {
    public VulkanDevice(){
        super(new VkDevice());
    }

    public VulkanDevice(VkDevice vk){
        super(vk);
    }

    @Override
    public VkDevice getVk(){
        return (VkDevice) super.getVk();
    }

    public VulkanDevice(int value){
        super(new VkDevice(value));
    }

    public static class Array extends VulkanDevice implements cz.mg.collections.array.ReadonlyArray<VulkanDevice> {
        public Array(VkDevice.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDevice.Array(count));
        }

        public Array(int count, VulkanDevice o){
            this(new VkDevice.Array(count, o.getVk()));
        }

        @Override
        public VkDevice.Array getVk(){
            return (VkDevice.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDevice get(int i){
            return new VulkanDevice(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDevice.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDevice.Pointer());
        }

        public Pointer(long value) {
            this(new VkDevice.Pointer(value));
        }

        @Override
        public VkDevice.Pointer getVk(){
            return (VkDevice.Pointer) super.getVk();
        }

        public static class Array extends VulkanDevice.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDevice.Pointer> {
            public Array(int count) {
                super(new VkDevice.Pointer.Array(count));
            }

            public Array(VulkanDevice[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDevice.Pointer.Array getVk(){
                return (VkDevice.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDevice.Pointer get(int i){
                return new VulkanDevice.Pointer(getVk().get(i));
            }
        }
    }
}
