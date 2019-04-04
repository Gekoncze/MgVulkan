package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolResetFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolResetFlags extends VulkanFlags {
    public VulkanCommandPoolResetFlags(){
        super(new VkCommandPoolResetFlags());
    }

    public VulkanCommandPoolResetFlags(VkCommandPoolResetFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolResetFlags getVk(){
        return (VkCommandPoolResetFlags) super.getVk();
    }

    public VulkanCommandPoolResetFlags(int value){
        super(new VkCommandPoolResetFlags(value));
    }

    public static class Array extends VulkanCommandPoolResetFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolResetFlags> {
        public Array(VkCommandPoolResetFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolResetFlags.Array(count));
        }

        public Array(int count, VulkanCommandPoolResetFlags o){
            this(new VkCommandPoolResetFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolResetFlags.Array getVk(){
            return (VkCommandPoolResetFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolResetFlags get(int i){
            return new VulkanCommandPoolResetFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolResetFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolResetFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolResetFlags.Pointer(value));
        }

        @Override
        public VkCommandPoolResetFlags.Pointer getVk(){
            return (VkCommandPoolResetFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolResetFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolResetFlags.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolResetFlags.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolResetFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolResetFlags.Pointer.Array getVk(){
                return (VkCommandPoolResetFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolResetFlags.Pointer get(int i){
                return new VulkanCommandPoolResetFlags.Pointer(getVk().get(i));
            }
        }
    }
}
