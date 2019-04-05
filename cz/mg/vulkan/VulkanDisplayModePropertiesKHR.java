package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayModePropertiesKHR extends VulkanObject {
    public VulkanDisplayModePropertiesKHR(){
        super(new VkDisplayModePropertiesKHR());
    }

    public VulkanDisplayModePropertiesKHR(VkDisplayModePropertiesKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModePropertiesKHR getVk(){
        return (VkDisplayModePropertiesKHR) super.getVk();
    }

    public VulkanDisplayModePropertiesKHR(VulkanDisplayModeKHR displayMode, VulkanDisplayModeParametersKHR parameters) {
        super(new VkDisplayModePropertiesKHR(displayMode.getVk(), parameters.getVk()));
    }

    public VulkanDisplayModeKHR getDisplayMode() {
        return new VulkanDisplayModeKHR(getVk().getDisplayMode());
    }

    public void setDisplayMode(VulkanDisplayModeKHR displayMode) {
        getVk().setDisplayMode(displayMode.getVk());
    }

    public VulkanDisplayModeParametersKHR getParameters() {
        return new VulkanDisplayModeParametersKHR(getVk().getParameters());
    }

    public void setParameters(VulkanDisplayModeParametersKHR parameters) {
        getVk().setParameters(parameters.getVk());
    }


    public static class Array extends VulkanDisplayModePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModePropertiesKHR> {
        public Array(VkDisplayModePropertiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayModePropertiesKHR.Array(count));
        }

        public Array(int count, VulkanDisplayModePropertiesKHR o){
            this(new VkDisplayModePropertiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModePropertiesKHR.Array getVk(){
            return (VkDisplayModePropertiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModePropertiesKHR get(int i){
            return new VulkanDisplayModePropertiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayModePropertiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayModePropertiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayModePropertiesKHR.Pointer(value));
        }

        @Override
        public VkDisplayModePropertiesKHR.Pointer getVk(){
            return (VkDisplayModePropertiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayModePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModePropertiesKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayModePropertiesKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayModePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayModePropertiesKHR.Pointer.Array getVk(){
                return (VkDisplayModePropertiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayModePropertiesKHR.Pointer get(int i){
                return new VulkanDisplayModePropertiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
