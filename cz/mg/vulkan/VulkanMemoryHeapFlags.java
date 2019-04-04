package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeapFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryHeapFlags extends VulkanFlags {
    public VulkanMemoryHeapFlags(){
        super(new VkMemoryHeapFlags());
    }

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryHeapFlags getVk(){
        return (VkMemoryHeapFlags) super.getVk();
    }

    public VulkanMemoryHeapFlags(int value){
        super(new VkMemoryHeapFlags(value));
    }

    public static class Array extends VulkanMemoryHeapFlags implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeapFlags> {
        public Array(VkMemoryHeapFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryHeapFlags.Array(count));
        }

        public Array(int count, VulkanMemoryHeapFlags o){
            this(new VkMemoryHeapFlags.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryHeapFlags.Array getVk(){
            return (VkMemoryHeapFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryHeapFlags get(int i){
            return new VulkanMemoryHeapFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryHeapFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryHeapFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryHeapFlags.Pointer(value));
        }

        @Override
        public VkMemoryHeapFlags.Pointer getVk(){
            return (VkMemoryHeapFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryHeapFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeapFlags.Pointer> {
            public Array(int count) {
                super(new VkMemoryHeapFlags.Pointer.Array(count));
            }

            public Array(VulkanMemoryHeapFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryHeapFlags.Pointer.Array getVk(){
                return (VkMemoryHeapFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryHeapFlags.Pointer get(int i){
                return new VulkanMemoryHeapFlags.Pointer(getVk().get(i));
            }
        }
    }
}
