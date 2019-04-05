package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSampleLocationsInfoEXT extends VulkanObject {
    public VulkanSampleLocationsInfoEXT(){
        super(new VkSampleLocationsInfoEXT());
    }

    public VulkanSampleLocationsInfoEXT(VkSampleLocationsInfoEXT vk){
        super(vk);
    }

    @Override
    public VkSampleLocationsInfoEXT getVk(){
        return (VkSampleLocationsInfoEXT) super.getVk();
    }
    public VulkanSampleLocationsInfoEXT(VulkanObject pNext, VulkanSampleCountFlagBits sampleLocationsPerPixel, VulkanExtent2D sampleLocationGridSize, VulkanUInt32 sampleLocationsCount, VulkanSampleLocationEXT pSampleLocations) {
        super(new VkSampleLocationsInfoEXT(pNext.getVk(), sampleLocationsPerPixel.getVk(), sampleLocationGridSize.getVk(), sampleLocationsCount.getVk(), pSampleLocations.getVk()));
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

    public VulkanSampleCountFlagBits getSampleLocationsPerPixel() {
        return new VulkanSampleCountFlagBits(getVk().getSampleLocationsPerPixel());
    }

    public void setSampleLocationsPerPixel(VulkanSampleCountFlagBits sampleLocationsPerPixel) {
        getVk().setSampleLocationsPerPixel(sampleLocationsPerPixel.getVk());
    }

    public VulkanExtent2D getSampleLocationGridSize() {
        return new VulkanExtent2D(getVk().getSampleLocationGridSize());
    }

    public void setSampleLocationGridSize(VulkanExtent2D sampleLocationGridSize) {
        getVk().setSampleLocationGridSize(sampleLocationGridSize.getVk());
    }

    public VulkanUInt32 getSampleLocationsCount() {
        return new VulkanUInt32(getVk().getSampleLocationsCount());
    }

    public void setSampleLocationsCount(VulkanUInt32 sampleLocationsCount) {
        getVk().setSampleLocationsCount(sampleLocationsCount.getVk());
    }

    public VulkanSampleLocationEXT getPSampleLocations() {
        return new VulkanSampleLocationEXT(getVk().getPSampleLocations());
    }

    public void setPSampleLocations(VulkanSampleLocationEXT pSampleLocations) {
        getVk().setPSampleLocations(pSampleLocations.getVk());
    }


    public static class Array extends VulkanSampleLocationsInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSampleLocationsInfoEXT> {
        public Array(VkSampleLocationsInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampleLocationsInfoEXT.Array(count));
        }

        public Array(int count, VulkanSampleLocationsInfoEXT o){
            this(new VkSampleLocationsInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSampleLocationsInfoEXT.Array getVk(){
            return (VkSampleLocationsInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampleLocationsInfoEXT get(int i){
            return new VulkanSampleLocationsInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampleLocationsInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampleLocationsInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampleLocationsInfoEXT.Pointer(value));
        }

        @Override
        public VkSampleLocationsInfoEXT.Pointer getVk(){
            return (VkSampleLocationsInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampleLocationsInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampleLocationsInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkSampleLocationsInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanSampleLocationsInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampleLocationsInfoEXT.Pointer.Array getVk(){
                return (VkSampleLocationsInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampleLocationsInfoEXT.Pointer get(int i){
                return new VulkanSampleLocationsInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
