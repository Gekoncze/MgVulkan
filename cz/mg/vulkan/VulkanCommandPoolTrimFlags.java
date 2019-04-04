package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolTrimFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolTrimFlags extends VulkanFlags {
    public VulkanCommandPoolTrimFlags(){
        super(new VkCommandPoolTrimFlags());
    }

    public VulkanCommandPoolTrimFlags(VkCommandPoolTrimFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolTrimFlags getVk(){
        return (VkCommandPoolTrimFlags) super.getVk();
    }

    public VulkanCommandPoolTrimFlags(int value){
        super(new VkCommandPoolTrimFlags(value));
    }

    public static class Array extends VulkanCommandPoolTrimFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolTrimFlags> {
        public Array(VkCommandPoolTrimFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolTrimFlags.Array(count));
        }

        public Array(int count, VulkanCommandPoolTrimFlags o){
            this(new VkCommandPoolTrimFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolTrimFlags.Array getVk(){
            return (VkCommandPoolTrimFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolTrimFlags get(int i){
            return new VulkanCommandPoolTrimFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolTrimFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolTrimFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolTrimFlags.Pointer(value));
        }

        @Override
        public VkCommandPoolTrimFlags.Pointer getVk(){
            return (VkCommandPoolTrimFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolTrimFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolTrimFlags.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolTrimFlags.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolTrimFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolTrimFlags.Pointer.Array getVk(){
                return (VkCommandPoolTrimFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolTrimFlags.Pointer get(int i){
                return new VulkanCommandPoolTrimFlags.Pointer(getVk().get(i));
            }
        }
    }
}
