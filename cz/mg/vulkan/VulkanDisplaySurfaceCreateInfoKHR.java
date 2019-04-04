package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplaySurfaceCreateInfoKHR.html">khronos documentation</a>
 **/
public class VulkanDisplaySurfaceCreateInfoKHR extends VulkanObject {
    public VulkanDisplaySurfaceCreateInfoKHR(){
        super(new VkDisplaySurfaceCreateInfoKHR());
    }

    public VulkanDisplaySurfaceCreateInfoKHR(VkDisplaySurfaceCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkDisplaySurfaceCreateInfoKHR getVk(){
        return (VkDisplaySurfaceCreateInfoKHR) super.getVk();
    }
    public VulkanDisplaySurfaceCreateInfoKHR(VulkanObject pNext, VulkanDisplaySurfaceCreateFlagsKHR flags, VulkanDisplayModeKHR displayMode, VulkanUInt32 planeIndex, VulkanUInt32 planeStackIndex, VulkanSurfaceTransformFlagBitsKHR transform, VulkanFloat globalAlpha, VulkanDisplayPlaneAlphaFlagBitsKHR alphaMode, VulkanExtent2D imageExtent) {
        super(new VkDisplaySurfaceCreateInfoKHR(pNext.getVk(), flags.getVk(), displayMode.getVk(), planeIndex.getVk(), planeStackIndex.getVk(), transform.getVk(), globalAlpha.getVk(), alphaMode.getVk(), imageExtent.getVk()));
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

    public VulkanDisplaySurfaceCreateFlagsKHR getFlags() {
        return new VulkanDisplaySurfaceCreateFlagsKHR(getVk().getFlags());
    }

    public void setFlags(VulkanDisplaySurfaceCreateFlagsKHR flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanDisplayModeKHR getDisplayMode() {
        return new VulkanDisplayModeKHR(getVk().getDisplayMode());
    }

    public void setDisplayMode(VulkanDisplayModeKHR displayMode) {
        getVk().setDisplayMode(displayMode.getVk());
    }

    public VulkanUInt32 getPlaneIndex() {
        return new VulkanUInt32(getVk().getPlaneIndex());
    }

    public void setPlaneIndex(VulkanUInt32 planeIndex) {
        getVk().setPlaneIndex(planeIndex.getVk());
    }

    public VulkanUInt32 getPlaneStackIndex() {
        return new VulkanUInt32(getVk().getPlaneStackIndex());
    }

    public void setPlaneStackIndex(VulkanUInt32 planeStackIndex) {
        getVk().setPlaneStackIndex(planeStackIndex.getVk());
    }

    public VulkanSurfaceTransformFlagBitsKHR getTransform() {
        return new VulkanSurfaceTransformFlagBitsKHR(getVk().getTransform());
    }

    public void setTransform(VulkanSurfaceTransformFlagBitsKHR transform) {
        getVk().setTransform(transform.getVk());
    }

    public VulkanFloat getGlobalAlpha() {
        return new VulkanFloat(getVk().getGlobalAlpha());
    }

    public void setGlobalAlpha(VulkanFloat globalAlpha) {
        getVk().setGlobalAlpha(globalAlpha.getVk());
    }

    public VulkanDisplayPlaneAlphaFlagBitsKHR getAlphaMode() {
        return new VulkanDisplayPlaneAlphaFlagBitsKHR(getVk().getAlphaMode());
    }

    public void setAlphaMode(VulkanDisplayPlaneAlphaFlagBitsKHR alphaMode) {
        getVk().setAlphaMode(alphaMode.getVk());
    }

    public VulkanExtent2D getImageExtent() {
        return new VulkanExtent2D(getVk().getImageExtent());
    }

    public void setImageExtent(VulkanExtent2D imageExtent) {
        getVk().setImageExtent(imageExtent.getVk());
    }


    public static class Array extends VulkanDisplaySurfaceCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplaySurfaceCreateInfoKHR> {
        public Array(VkDisplaySurfaceCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplaySurfaceCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanDisplaySurfaceCreateInfoKHR o){
            this(new VkDisplaySurfaceCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplaySurfaceCreateInfoKHR.Array getVk(){
            return (VkDisplaySurfaceCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplaySurfaceCreateInfoKHR get(int i){
            return new VulkanDisplaySurfaceCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplaySurfaceCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplaySurfaceCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplaySurfaceCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkDisplaySurfaceCreateInfoKHR.Pointer getVk(){
            return (VkDisplaySurfaceCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplaySurfaceCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplaySurfaceCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplaySurfaceCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplaySurfaceCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplaySurfaceCreateInfoKHR.Pointer.Array getVk(){
                return (VkDisplaySurfaceCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplaySurfaceCreateInfoKHR.Pointer get(int i){
                return new VulkanDisplaySurfaceCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
