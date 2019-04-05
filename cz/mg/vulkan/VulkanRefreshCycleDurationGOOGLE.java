package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRefreshCycleDurationGOOGLE extends VulkanObject {
    public VulkanRefreshCycleDurationGOOGLE(){
        super(new VkRefreshCycleDurationGOOGLE());
    }

    public VulkanRefreshCycleDurationGOOGLE(VkRefreshCycleDurationGOOGLE vk){
        super(vk);
    }

    @Override
    public VkRefreshCycleDurationGOOGLE getVk(){
        return (VkRefreshCycleDurationGOOGLE) super.getVk();
    }

    public VulkanRefreshCycleDurationGOOGLE(VulkanUInt64 refreshDuration) {
        super(new VkRefreshCycleDurationGOOGLE(refreshDuration.getVk()));
    }

    public VulkanUInt64 getRefreshDuration() {
        return new VulkanUInt64(getVk().getRefreshDuration());
    }

    public void setRefreshDuration(VulkanUInt64 refreshDuration) {
        getVk().setRefreshDuration(refreshDuration.getVk());
    }


    public static class Array extends VulkanRefreshCycleDurationGOOGLE implements cz.mg.collections.array.ReadonlyArray<VulkanRefreshCycleDurationGOOGLE> {
        public Array(VkRefreshCycleDurationGOOGLE.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRefreshCycleDurationGOOGLE.Array(count));
        }

        public Array(int count, VulkanRefreshCycleDurationGOOGLE o){
            this(new VkRefreshCycleDurationGOOGLE.Array(count, o.getVk()));
        }

        @Override
        public VkRefreshCycleDurationGOOGLE.Array getVk(){
            return (VkRefreshCycleDurationGOOGLE.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRefreshCycleDurationGOOGLE get(int i){
            return new VulkanRefreshCycleDurationGOOGLE(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRefreshCycleDurationGOOGLE.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRefreshCycleDurationGOOGLE.Pointer());
        }

        public Pointer(long value) {
            this(new VkRefreshCycleDurationGOOGLE.Pointer(value));
        }

        @Override
        public VkRefreshCycleDurationGOOGLE.Pointer getVk(){
            return (VkRefreshCycleDurationGOOGLE.Pointer) super.getVk();
        }

        public static class Array extends VulkanRefreshCycleDurationGOOGLE.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRefreshCycleDurationGOOGLE.Pointer> {
            public Array(int count) {
                super(new VkRefreshCycleDurationGOOGLE.Pointer.Array(count));
            }

            public Array(VulkanRefreshCycleDurationGOOGLE[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRefreshCycleDurationGOOGLE.Pointer.Array getVk(){
                return (VkRefreshCycleDurationGOOGLE.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRefreshCycleDurationGOOGLE.Pointer get(int i){
                return new VulkanRefreshCycleDurationGOOGLE.Pointer(getVk().get(i));
            }
        }
    }
}
