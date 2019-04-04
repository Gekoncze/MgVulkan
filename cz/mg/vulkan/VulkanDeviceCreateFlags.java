package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDeviceCreateFlags extends VulkanFlags {
    public VulkanDeviceCreateFlags(){
        super(new VkDeviceCreateFlags());
    }

    public VulkanDeviceCreateFlags(VkDeviceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDeviceCreateFlags getVk(){
        return (VkDeviceCreateFlags) super.getVk();
    }

    public VulkanDeviceCreateFlags(int value){
        super(new VkDeviceCreateFlags(value));
    }

    public static class Array extends VulkanDeviceCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceCreateFlags> {
        public Array(VkDeviceCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceCreateFlags.Array(count));
        }

        public Array(int count, VulkanDeviceCreateFlags o){
            this(new VkDeviceCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceCreateFlags.Array getVk(){
            return (VkDeviceCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceCreateFlags get(int i){
            return new VulkanDeviceCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceCreateFlags.Pointer(value));
        }

        @Override
        public VkDeviceCreateFlags.Pointer getVk(){
            return (VkDeviceCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkDeviceCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanDeviceCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceCreateFlags.Pointer.Array getVk(){
                return (VkDeviceCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceCreateFlags.Pointer get(int i){
                return new VulkanDeviceCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
