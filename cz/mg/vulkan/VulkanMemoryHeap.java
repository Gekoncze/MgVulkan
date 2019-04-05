package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryHeap extends VulkanObject {
    public VulkanMemoryHeap(){
        super(new VkMemoryHeap());
    }

    public VulkanMemoryHeap(VkMemoryHeap vk){
        super(vk);
    }

    @Override
    public VkMemoryHeap getVk(){
        return (VkMemoryHeap) super.getVk();
    }

    public VulkanMemoryHeap(VulkanDeviceSize size, VulkanMemoryHeapFlags flags) {
        super(new VkMemoryHeap(size.getVk(), flags.getVk()));
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }

    public VulkanMemoryHeapFlags getFlags() {
        return new VulkanMemoryHeapFlags(getVk().getFlags());
    }

    public void setFlags(VulkanMemoryHeapFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanMemoryHeap implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeap> {
        public Array(VkMemoryHeap.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryHeap.Array(count));
        }

        public Array(int count, VulkanMemoryHeap o){
            this(new VkMemoryHeap.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryHeap.Array getVk(){
            return (VkMemoryHeap.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryHeap get(int i){
            return new VulkanMemoryHeap(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryHeap.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryHeap.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryHeap.Pointer(value));
        }

        @Override
        public VkMemoryHeap.Pointer getVk(){
            return (VkMemoryHeap.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryHeap.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeap.Pointer> {
            public Array(int count) {
                super(new VkMemoryHeap.Pointer.Array(count));
            }

            public Array(VulkanMemoryHeap[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryHeap.Pointer.Array getVk(){
                return (VkMemoryHeap.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryHeap.Pointer get(int i){
                return new VulkanMemoryHeap.Pointer(getVk().get(i));
            }
        }
    }
}
