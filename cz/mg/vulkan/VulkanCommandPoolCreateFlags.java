package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolCreateFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolCreateFlags extends VulkanFlags {
    public VulkanCommandPoolCreateFlags(){
        super(new VkCommandPoolCreateFlags());
    }

    public VulkanCommandPoolCreateFlags(VkCommandPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateFlags getVk(){
        return (VkCommandPoolCreateFlags) super.getVk();
    }

    public VulkanCommandPoolCreateFlags(int value){
        super(new VkCommandPoolCreateFlags(value));
    }

    public static class Array extends VulkanCommandPoolCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateFlags> {
        public Array(VkCommandPoolCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolCreateFlags.Array(count));
        }

        public Array(int count, VulkanCommandPoolCreateFlags o){
            this(new VkCommandPoolCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolCreateFlags.Array getVk(){
            return (VkCommandPoolCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolCreateFlags get(int i){
            return new VulkanCommandPoolCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolCreateFlags.Pointer(value));
        }

        @Override
        public VkCommandPoolCreateFlags.Pointer getVk(){
            return (VkCommandPoolCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolCreateFlags.Pointer.Array getVk(){
                return (VkCommandPoolCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolCreateFlags.Pointer get(int i){
                return new VulkanCommandPoolCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
