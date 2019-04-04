package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkHdrMetadataEXT.html">khronos documentation</a>
 **/
public class VulkanHdrMetadataEXT extends VulkanObject {
    public VulkanHdrMetadataEXT(){
        super(new VkHdrMetadataEXT());
    }

    public VulkanHdrMetadataEXT(VkHdrMetadataEXT vk){
        super(vk);
    }

    @Override
    public VkHdrMetadataEXT getVk(){
        return (VkHdrMetadataEXT) super.getVk();
    }

    public VulkanHdrMetadataEXT(VulkanStructureType sType, VulkanObject pNext, VulkanXYColorEXT displayPrimaryRed, VulkanXYColorEXT displayPrimaryGreen, VulkanXYColorEXT displayPrimaryBlue, VulkanXYColorEXT whitePoint, VulkanFloat maxLuminance, VulkanFloat minLuminance, VulkanFloat maxContentLightLevel, VulkanFloat maxFrameAverageLightLevel) {
        super(new VkHdrMetadataEXT(sType.getVk(), pNext.getVk(), displayPrimaryRed.getVk(), displayPrimaryGreen.getVk(), displayPrimaryBlue.getVk(), whitePoint.getVk(), maxLuminance.getVk(), minLuminance.getVk(), maxContentLightLevel.getVk(), maxFrameAverageLightLevel.getVk()));
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

    public VulkanXYColorEXT getDisplayPrimaryRed() {
        return new VulkanXYColorEXT(getVk().getDisplayPrimaryRed());
    }

    public void setDisplayPrimaryRed(VulkanXYColorEXT displayPrimaryRed) {
        getVk().setDisplayPrimaryRed(displayPrimaryRed.getVk());
    }

    public VulkanXYColorEXT getDisplayPrimaryGreen() {
        return new VulkanXYColorEXT(getVk().getDisplayPrimaryGreen());
    }

    public void setDisplayPrimaryGreen(VulkanXYColorEXT displayPrimaryGreen) {
        getVk().setDisplayPrimaryGreen(displayPrimaryGreen.getVk());
    }

    public VulkanXYColorEXT getDisplayPrimaryBlue() {
        return new VulkanXYColorEXT(getVk().getDisplayPrimaryBlue());
    }

    public void setDisplayPrimaryBlue(VulkanXYColorEXT displayPrimaryBlue) {
        getVk().setDisplayPrimaryBlue(displayPrimaryBlue.getVk());
    }

    public VulkanXYColorEXT getWhitePoint() {
        return new VulkanXYColorEXT(getVk().getWhitePoint());
    }

    public void setWhitePoint(VulkanXYColorEXT whitePoint) {
        getVk().setWhitePoint(whitePoint.getVk());
    }

    public VulkanFloat getMaxLuminance() {
        return new VulkanFloat(getVk().getMaxLuminance());
    }

    public void setMaxLuminance(VulkanFloat maxLuminance) {
        getVk().setMaxLuminance(maxLuminance.getVk());
    }

    public VulkanFloat getMinLuminance() {
        return new VulkanFloat(getVk().getMinLuminance());
    }

    public void setMinLuminance(VulkanFloat minLuminance) {
        getVk().setMinLuminance(minLuminance.getVk());
    }

    public VulkanFloat getMaxContentLightLevel() {
        return new VulkanFloat(getVk().getMaxContentLightLevel());
    }

    public void setMaxContentLightLevel(VulkanFloat maxContentLightLevel) {
        getVk().setMaxContentLightLevel(maxContentLightLevel.getVk());
    }

    public VulkanFloat getMaxFrameAverageLightLevel() {
        return new VulkanFloat(getVk().getMaxFrameAverageLightLevel());
    }

    public void setMaxFrameAverageLightLevel(VulkanFloat maxFrameAverageLightLevel) {
        getVk().setMaxFrameAverageLightLevel(maxFrameAverageLightLevel.getVk());
    }


    public static class Array extends VulkanHdrMetadataEXT implements cz.mg.collections.array.ReadonlyArray<VulkanHdrMetadataEXT> {
        public Array(VkHdrMetadataEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkHdrMetadataEXT.Array(count));
        }

        public Array(int count, VulkanHdrMetadataEXT o){
            this(new VkHdrMetadataEXT.Array(count, o.getVk()));
        }

        @Override
        public VkHdrMetadataEXT.Array getVk(){
            return (VkHdrMetadataEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanHdrMetadataEXT get(int i){
            return new VulkanHdrMetadataEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkHdrMetadataEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkHdrMetadataEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkHdrMetadataEXT.Pointer(value));
        }

        @Override
        public VkHdrMetadataEXT.Pointer getVk(){
            return (VkHdrMetadataEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanHdrMetadataEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanHdrMetadataEXT.Pointer> {
            public Array(int count) {
                super(new VkHdrMetadataEXT.Pointer.Array(count));
            }

            public Array(VulkanHdrMetadataEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkHdrMetadataEXT.Pointer.Array getVk(){
                return (VkHdrMetadataEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanHdrMetadataEXT.Pointer get(int i){
                return new VulkanHdrMetadataEXT.Pointer(getVk().get(i));
            }
        }
    }
}
