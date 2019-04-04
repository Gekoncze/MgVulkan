package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryAllocateFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryAllocateFlags extends VulkanFlags {
    public VulkanMemoryAllocateFlags(){
        super(new VkMemoryAllocateFlags());
    }

    public VulkanMemoryAllocateFlags(VkMemoryAllocateFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlags getVk(){
        return (VkMemoryAllocateFlags) super.getVk();
    }

    public VulkanMemoryAllocateFlags(int value){
        super(new VkMemoryAllocateFlags(value));
    }

    public static class Array extends VulkanMemoryAllocateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlags> {
        public Array(VkMemoryAllocateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryAllocateFlags.Array(count));
        }

        public Array(int count, VulkanMemoryAllocateFlags o){
            this(new VkMemoryAllocateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryAllocateFlags.Array getVk(){
            return (VkMemoryAllocateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryAllocateFlags get(int i){
            return new VulkanMemoryAllocateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryAllocateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryAllocateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryAllocateFlags.Pointer(value));
        }

        @Override
        public VkMemoryAllocateFlags.Pointer getVk(){
            return (VkMemoryAllocateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryAllocateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlags.Pointer> {
            public Array(int count) {
                super(new VkMemoryAllocateFlags.Pointer.Array(count));
            }

            public Array(VulkanMemoryAllocateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryAllocateFlags.Pointer.Array getVk(){
                return (VkMemoryAllocateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryAllocateFlags.Pointer get(int i){
                return new VulkanMemoryAllocateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
