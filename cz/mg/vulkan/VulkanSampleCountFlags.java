package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleCountFlags.html">khronos documentation</a>
 **/
public class VulkanSampleCountFlags extends VulkanFlags {
    public VulkanSampleCountFlags(){
        super(new VkSampleCountFlags());
    }

    public VulkanSampleCountFlags(VkSampleCountFlags vk){
        super(vk);
    }

    @Override
    public VkSampleCountFlags getVk(){
        return (VkSampleCountFlags) super.getVk();
    }

    public VulkanSampleCountFlags(int value){
        super(new VkSampleCountFlags(value));
    }

    public static class Array extends VulkanSampleCountFlags implements cz.mg.collections.array.ReadonlyArray<VulkanSampleCountFlags> {
        public Array(VkSampleCountFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampleCountFlags.Array(count));
        }

        public Array(int count, VulkanSampleCountFlags o){
            this(new VkSampleCountFlags.Array(count, o.getVk()));
        }

        @Override
        public VkSampleCountFlags.Array getVk(){
            return (VkSampleCountFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampleCountFlags get(int i){
            return new VulkanSampleCountFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampleCountFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampleCountFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampleCountFlags.Pointer(value));
        }

        @Override
        public VkSampleCountFlags.Pointer getVk(){
            return (VkSampleCountFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampleCountFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampleCountFlags.Pointer> {
            public Array(int count) {
                super(new VkSampleCountFlags.Pointer.Array(count));
            }

            public Array(VulkanSampleCountFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampleCountFlags.Pointer.Array getVk(){
                return (VkSampleCountFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampleCountFlags.Pointer get(int i){
                return new VulkanSampleCountFlags.Pointer(getVk().get(i));
            }
        }
    }
}
