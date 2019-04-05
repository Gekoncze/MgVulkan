package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayModeCreateInfoKHR extends VulkanObject {
    public VulkanDisplayModeCreateInfoKHR(){
        super(new VkDisplayModeCreateInfoKHR());
    }

    public VulkanDisplayModeCreateInfoKHR(VkDisplayModeCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeCreateInfoKHR getVk(){
        return (VkDisplayModeCreateInfoKHR) super.getVk();
    }
    public VulkanDisplayModeCreateInfoKHR(VulkanObject pNext, VulkanDisplayModeCreateFlagsKHR flags, VulkanDisplayModeParametersKHR parameters) {
        super(new VkDisplayModeCreateInfoKHR(pNext.getVk(), flags.getVk(), parameters.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanDisplayModeCreateFlagsKHR getFlags() {
        return new VulkanDisplayModeCreateFlagsKHR(getVk().getFlags());
    }

    public void setFlags(VulkanDisplayModeCreateFlagsKHR flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanDisplayModeParametersKHR getParameters() {
        return new VulkanDisplayModeParametersKHR(getVk().getParameters());
    }

    public void setParameters(VulkanDisplayModeParametersKHR parameters) {
        getVk().setParameters(parameters.getVk());
    }


    public static class Array extends VulkanDisplayModeCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeCreateInfoKHR> {
        public Array(VkDisplayModeCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayModeCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanDisplayModeCreateInfoKHR o){
            this(new VkDisplayModeCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModeCreateInfoKHR.Array getVk(){
            return (VkDisplayModeCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModeCreateInfoKHR get(int i){
            return new VulkanDisplayModeCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayModeCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayModeCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayModeCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkDisplayModeCreateInfoKHR.Pointer getVk(){
            return (VkDisplayModeCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayModeCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayModeCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayModeCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayModeCreateInfoKHR.Pointer.Array getVk(){
                return (VkDisplayModeCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayModeCreateInfoKHR.Pointer get(int i){
                return new VulkanDisplayModeCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
