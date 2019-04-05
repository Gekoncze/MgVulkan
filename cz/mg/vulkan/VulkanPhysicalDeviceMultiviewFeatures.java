package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceMultiviewFeatures extends VulkanObject {
    public VulkanPhysicalDeviceMultiviewFeatures(){
        super(new VkPhysicalDeviceMultiviewFeatures());
    }

    public VulkanPhysicalDeviceMultiviewFeatures(VkPhysicalDeviceMultiviewFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceMultiviewFeatures getVk(){
        return (VkPhysicalDeviceMultiviewFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceMultiviewFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 multiview, VulkanBool32 multiviewGeometryShader, VulkanBool32 multiviewTessellationShader) {
        super(new VkPhysicalDeviceMultiviewFeatures(sType.getVk(), pNext.getVk(), multiview.getVk(), multiviewGeometryShader.getVk(), multiviewTessellationShader.getVk()));
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

    public VulkanBool32 getMultiview() {
        return new VulkanBool32(getVk().getMultiview());
    }

    public void setMultiview(VulkanBool32 multiview) {
        getVk().setMultiview(multiview.getVk());
    }

    public VulkanBool32 getMultiviewGeometryShader() {
        return new VulkanBool32(getVk().getMultiviewGeometryShader());
    }

    public void setMultiviewGeometryShader(VulkanBool32 multiviewGeometryShader) {
        getVk().setMultiviewGeometryShader(multiviewGeometryShader.getVk());
    }

    public VulkanBool32 getMultiviewTessellationShader() {
        return new VulkanBool32(getVk().getMultiviewTessellationShader());
    }

    public void setMultiviewTessellationShader(VulkanBool32 multiviewTessellationShader) {
        getVk().setMultiviewTessellationShader(multiviewTessellationShader.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceMultiviewFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewFeatures> {
        public Array(VkPhysicalDeviceMultiviewFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceMultiviewFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceMultiviewFeatures o){
            this(new VkPhysicalDeviceMultiviewFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceMultiviewFeatures.Array getVk(){
            return (VkPhysicalDeviceMultiviewFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceMultiviewFeatures get(int i){
            return new VulkanPhysicalDeviceMultiviewFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceMultiviewFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceMultiviewFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceMultiviewFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceMultiviewFeatures.Pointer getVk(){
            return (VkPhysicalDeviceMultiviewFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceMultiviewFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceMultiviewFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceMultiviewFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceMultiviewFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceMultiviewFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceMultiviewFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceMultiviewFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceMultiviewFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
