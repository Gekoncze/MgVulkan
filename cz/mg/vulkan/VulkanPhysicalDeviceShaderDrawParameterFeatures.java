package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceShaderDrawParameterFeatures extends VulkanObject {
    public VulkanPhysicalDeviceShaderDrawParameterFeatures(){
        super(new VkPhysicalDeviceShaderDrawParameterFeatures());
    }

    public VulkanPhysicalDeviceShaderDrawParameterFeatures(VkPhysicalDeviceShaderDrawParameterFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceShaderDrawParameterFeatures getVk(){
        return (VkPhysicalDeviceShaderDrawParameterFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceShaderDrawParameterFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 shaderDrawParameters) {
        super(new VkPhysicalDeviceShaderDrawParameterFeatures(sType.getVk(), pNext.getVk(), shaderDrawParameters.getVk()));
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

    public VulkanBool32 getShaderDrawParameters() {
        return new VulkanBool32(getVk().getShaderDrawParameters());
    }

    public void setShaderDrawParameters(VulkanBool32 shaderDrawParameters) {
        getVk().setShaderDrawParameters(shaderDrawParameters.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceShaderDrawParameterFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceShaderDrawParameterFeatures> {
        public Array(VkPhysicalDeviceShaderDrawParameterFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceShaderDrawParameterFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceShaderDrawParameterFeatures o){
            this(new VkPhysicalDeviceShaderDrawParameterFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceShaderDrawParameterFeatures.Array getVk(){
            return (VkPhysicalDeviceShaderDrawParameterFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceShaderDrawParameterFeatures get(int i){
            return new VulkanPhysicalDeviceShaderDrawParameterFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceShaderDrawParameterFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceShaderDrawParameterFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceShaderDrawParameterFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceShaderDrawParameterFeatures.Pointer getVk(){
            return (VkPhysicalDeviceShaderDrawParameterFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceShaderDrawParameterFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceShaderDrawParameterFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceShaderDrawParameterFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceShaderDrawParameterFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceShaderDrawParameterFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceShaderDrawParameterFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceShaderDrawParameterFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceShaderDrawParameterFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
