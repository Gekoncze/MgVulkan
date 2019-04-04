package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseMemoryBind.html">khronos documentation</a>
 **/
public class VulkanSparseMemoryBind extends VulkanObject {
    public VulkanSparseMemoryBind(){
        super(new VkSparseMemoryBind());
    }

    public VulkanSparseMemoryBind(VkSparseMemoryBind vk){
        super(vk);
    }

    @Override
    public VkSparseMemoryBind getVk(){
        return (VkSparseMemoryBind) super.getVk();
    }

    public VulkanSparseMemoryBind(VulkanDeviceSize resourceOffset, VulkanDeviceSize size, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset, VulkanSparseMemoryBindFlags flags) {
        super(new VkSparseMemoryBind(resourceOffset.getVk(), size.getVk(), memory.getVk(), memoryOffset.getVk(), flags.getVk()));
    }

    public VulkanDeviceSize getResourceOffset() {
        return new VulkanDeviceSize(getVk().getResourceOffset());
    }

    public void setResourceOffset(VulkanDeviceSize resourceOffset) {
        getVk().setResourceOffset(resourceOffset.getVk());
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }

    public VulkanDeviceMemory getMemory() {
        return new VulkanDeviceMemory(getVk().getMemory());
    }

    public void setMemory(VulkanDeviceMemory memory) {
        getVk().setMemory(memory.getVk());
    }

    public VulkanDeviceSize getMemoryOffset() {
        return new VulkanDeviceSize(getVk().getMemoryOffset());
    }

    public void setMemoryOffset(VulkanDeviceSize memoryOffset) {
        getVk().setMemoryOffset(memoryOffset.getVk());
    }

    public VulkanSparseMemoryBindFlags getFlags() {
        return new VulkanSparseMemoryBindFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSparseMemoryBindFlags flags) {
        getVk().setFlags(flags.getVk());
    }


    public static class Array extends VulkanSparseMemoryBind implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBind> {
        public Array(VkSparseMemoryBind.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseMemoryBind.Array(count));
        }

        public Array(int count, VulkanSparseMemoryBind o){
            this(new VkSparseMemoryBind.Array(count, o.getVk()));
        }

        @Override
        public VkSparseMemoryBind.Array getVk(){
            return (VkSparseMemoryBind.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseMemoryBind get(int i){
            return new VulkanSparseMemoryBind(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseMemoryBind.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseMemoryBind.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseMemoryBind.Pointer(value));
        }

        @Override
        public VkSparseMemoryBind.Pointer getVk(){
            return (VkSparseMemoryBind.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseMemoryBind.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBind.Pointer> {
            public Array(int count) {
                super(new VkSparseMemoryBind.Pointer.Array(count));
            }

            public Array(VulkanSparseMemoryBind[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseMemoryBind.Pointer.Array getVk(){
                return (VkSparseMemoryBind.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseMemoryBind.Pointer get(int i){
                return new VulkanSparseMemoryBind.Pointer(getVk().get(i));
            }
        }
    }
}
