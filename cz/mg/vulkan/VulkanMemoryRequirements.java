package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryRequirements extends VulkanObject {
    public VulkanMemoryRequirements(){
        super(new VkMemoryRequirements());
    }

    public VulkanMemoryRequirements(VkMemoryRequirements vk){
        super(vk);
    }

    @Override
    public VkMemoryRequirements getVk(){
        return (VkMemoryRequirements) super.getVk();
    }

    public VulkanMemoryRequirements(VulkanDeviceSize size, VulkanDeviceSize alignment, VulkanUInt32 memoryTypeBits) {
        super(new VkMemoryRequirements(size.getVk(), alignment.getVk(), memoryTypeBits.getVk()));
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }

    public VulkanDeviceSize getAlignment() {
        return new VulkanDeviceSize(getVk().getAlignment());
    }

    public void setAlignment(VulkanDeviceSize alignment) {
        getVk().setAlignment(alignment.getVk());
    }

    public VulkanUInt32 getMemoryTypeBits() {
        return new VulkanUInt32(getVk().getMemoryTypeBits());
    }

    public void setMemoryTypeBits(VulkanUInt32 memoryTypeBits) {
        getVk().setMemoryTypeBits(memoryTypeBits.getVk());
    }


    public static class Array extends VulkanMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryRequirements> {
        public Array(VkMemoryRequirements.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryRequirements.Array(count));
        }

        public Array(int count, VulkanMemoryRequirements o){
            this(new VkMemoryRequirements.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryRequirements.Array getVk(){
            return (VkMemoryRequirements.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryRequirements get(int i){
            return new VulkanMemoryRequirements(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryRequirements.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryRequirements.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryRequirements.Pointer(value));
        }

        @Override
        public VkMemoryRequirements.Pointer getVk(){
            return (VkMemoryRequirements.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryRequirements.Pointer> {
            public Array(int count) {
                super(new VkMemoryRequirements.Pointer.Array(count));
            }

            public Array(VulkanMemoryRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryRequirements.Pointer.Array getVk(){
                return (VkMemoryRequirements.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryRequirements.Pointer get(int i){
                return new VulkanMemoryRequirements.Pointer(getVk().get(i));
            }
        }
    }
}
