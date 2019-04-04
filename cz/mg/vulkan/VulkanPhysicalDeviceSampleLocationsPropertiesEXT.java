package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSampleLocationsPropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceSampleLocationsPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceSampleLocationsPropertiesEXT(){
        super(new VkPhysicalDeviceSampleLocationsPropertiesEXT());
    }

    public VulkanPhysicalDeviceSampleLocationsPropertiesEXT(VkPhysicalDeviceSampleLocationsPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSampleLocationsPropertiesEXT getVk(){
        return (VkPhysicalDeviceSampleLocationsPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceSampleLocationsPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanSampleCountFlags sampleLocationSampleCounts, VulkanExtent2D maxSampleLocationGridSize, VulkanFloat sampleLocationCoordinateRange, VulkanUInt32 sampleLocationSubPixelBits, VulkanBool32 variableSampleLocations) {
        super(new VkPhysicalDeviceSampleLocationsPropertiesEXT(sType.getVk(), pNext.getVk(), sampleLocationSampleCounts.getVk(), maxSampleLocationGridSize.getVk(), sampleLocationCoordinateRange.getVk(), sampleLocationSubPixelBits.getVk(), variableSampleLocations.getVk()));
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

    public VulkanSampleCountFlags getSampleLocationSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampleLocationSampleCounts());
    }

    public void setSampleLocationSampleCounts(VulkanSampleCountFlags sampleLocationSampleCounts) {
        getVk().setSampleLocationSampleCounts(sampleLocationSampleCounts.getVk());
    }

    public VulkanExtent2D getMaxSampleLocationGridSize() {
        return new VulkanExtent2D(getVk().getMaxSampleLocationGridSize());
    }

    public void setMaxSampleLocationGridSize(VulkanExtent2D maxSampleLocationGridSize) {
        getVk().setMaxSampleLocationGridSize(maxSampleLocationGridSize.getVk());
    }

    public VulkanFloat getSampleLocationCoordinateRange() {
        return new VulkanFloat(getVk().getSampleLocationCoordinateRange());
    }

    public void setSampleLocationCoordinateRange(VulkanFloat sampleLocationCoordinateRange) {
        getVk().setSampleLocationCoordinateRange(sampleLocationCoordinateRange.getVk());
    }

    public VulkanUInt32 getSampleLocationSubPixelBits() {
        return new VulkanUInt32(getVk().getSampleLocationSubPixelBits());
    }

    public void setSampleLocationSubPixelBits(VulkanUInt32 sampleLocationSubPixelBits) {
        getVk().setSampleLocationSubPixelBits(sampleLocationSubPixelBits.getVk());
    }

    public VulkanBool32 getVariableSampleLocations() {
        return new VulkanBool32(getVk().getVariableSampleLocations());
    }

    public void setVariableSampleLocations(VulkanBool32 variableSampleLocations) {
        getVk().setVariableSampleLocations(variableSampleLocations.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSampleLocationsPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSampleLocationsPropertiesEXT> {
        public Array(VkPhysicalDeviceSampleLocationsPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSampleLocationsPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSampleLocationsPropertiesEXT o){
            this(new VkPhysicalDeviceSampleLocationsPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceSampleLocationsPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSampleLocationsPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceSampleLocationsPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSampleLocationsPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSampleLocationsPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSampleLocationsPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSampleLocationsPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceSampleLocationsPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
