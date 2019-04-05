package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayModeParametersKHR extends VulkanObject {
    public VulkanDisplayModeParametersKHR(){
        super(new VkDisplayModeParametersKHR());
    }

    public VulkanDisplayModeParametersKHR(VkDisplayModeParametersKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeParametersKHR getVk(){
        return (VkDisplayModeParametersKHR) super.getVk();
    }

    public VulkanDisplayModeParametersKHR(VulkanExtent2D visibleRegion, VulkanUInt32 refreshRate) {
        super(new VkDisplayModeParametersKHR(visibleRegion.getVk(), refreshRate.getVk()));
    }

    public VulkanExtent2D getVisibleRegion() {
        return new VulkanExtent2D(getVk().getVisibleRegion());
    }

    public void setVisibleRegion(VulkanExtent2D visibleRegion) {
        getVk().setVisibleRegion(visibleRegion.getVk());
    }

    public VulkanUInt32 getRefreshRate() {
        return new VulkanUInt32(getVk().getRefreshRate());
    }

    public void setRefreshRate(VulkanUInt32 refreshRate) {
        getVk().setRefreshRate(refreshRate.getVk());
    }


    public static class Array extends VulkanDisplayModeParametersKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeParametersKHR> {
        public Array(VkDisplayModeParametersKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayModeParametersKHR.Array(count));
        }

        public Array(int count, VulkanDisplayModeParametersKHR o){
            this(new VkDisplayModeParametersKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModeParametersKHR.Array getVk(){
            return (VkDisplayModeParametersKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModeParametersKHR get(int i){
            return new VulkanDisplayModeParametersKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayModeParametersKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayModeParametersKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayModeParametersKHR.Pointer(value));
        }

        @Override
        public VkDisplayModeParametersKHR.Pointer getVk(){
            return (VkDisplayModeParametersKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayModeParametersKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeParametersKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayModeParametersKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayModeParametersKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayModeParametersKHR.Pointer.Array getVk(){
                return (VkDisplayModeParametersKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayModeParametersKHR.Pointer get(int i){
                return new VulkanDisplayModeParametersKHR.Pointer(getVk().get(i));
            }
        }
    }
}
