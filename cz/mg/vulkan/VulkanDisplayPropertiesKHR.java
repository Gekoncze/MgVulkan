package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayPropertiesKHR extends VulkanObject {
    public VulkanDisplayPropertiesKHR(){
        super(new VkDisplayPropertiesKHR());
    }

    public VulkanDisplayPropertiesKHR(VkDisplayPropertiesKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPropertiesKHR getVk(){
        return (VkDisplayPropertiesKHR) super.getVk();
    }

    public VulkanDisplayPropertiesKHR(VulkanDisplayKHR display, VulkanChar displayName, VulkanExtent2D physicalDimensions, VulkanExtent2D physicalResolution, VulkanSurfaceTransformFlagsKHR supportedTransforms, VulkanBool32 planeReorderPossible, VulkanBool32 persistentContent) {
        super(new VkDisplayPropertiesKHR(display.getVk(), displayName.getVk(), physicalDimensions.getVk(), physicalResolution.getVk(), supportedTransforms.getVk(), planeReorderPossible.getVk(), persistentContent.getVk()));
    }

    public VulkanDisplayKHR getDisplay() {
        return new VulkanDisplayKHR(getVk().getDisplay());
    }

    public void setDisplay(VulkanDisplayKHR display) {
        getVk().setDisplay(display.getVk());
    }

    public VulkanChar getDisplayName() {
        return new VulkanChar(getVk().getDisplayName());
    }

    public void setDisplayName(VulkanChar displayName) {
        getVk().setDisplayName(displayName.getVk());
    }

    public VulkanExtent2D getPhysicalDimensions() {
        return new VulkanExtent2D(getVk().getPhysicalDimensions());
    }

    public void setPhysicalDimensions(VulkanExtent2D physicalDimensions) {
        getVk().setPhysicalDimensions(physicalDimensions.getVk());
    }

    public VulkanExtent2D getPhysicalResolution() {
        return new VulkanExtent2D(getVk().getPhysicalResolution());
    }

    public void setPhysicalResolution(VulkanExtent2D physicalResolution) {
        getVk().setPhysicalResolution(physicalResolution.getVk());
    }

    public VulkanSurfaceTransformFlagsKHR getSupportedTransforms() {
        return new VulkanSurfaceTransformFlagsKHR(getVk().getSupportedTransforms());
    }

    public void setSupportedTransforms(VulkanSurfaceTransformFlagsKHR supportedTransforms) {
        getVk().setSupportedTransforms(supportedTransforms.getVk());
    }

    public VulkanBool32 getPlaneReorderPossible() {
        return new VulkanBool32(getVk().getPlaneReorderPossible());
    }

    public void setPlaneReorderPossible(VulkanBool32 planeReorderPossible) {
        getVk().setPlaneReorderPossible(planeReorderPossible.getVk());
    }

    public VulkanBool32 getPersistentContent() {
        return new VulkanBool32(getVk().getPersistentContent());
    }

    public void setPersistentContent(VulkanBool32 persistentContent) {
        getVk().setPersistentContent(persistentContent.getVk());
    }


    public static class Array extends VulkanDisplayPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPropertiesKHR> {
        public Array(VkDisplayPropertiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPropertiesKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPropertiesKHR o){
            this(new VkDisplayPropertiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPropertiesKHR.Array getVk(){
            return (VkDisplayPropertiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPropertiesKHR get(int i){
            return new VulkanDisplayPropertiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPropertiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPropertiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPropertiesKHR.Pointer(value));
        }

        @Override
        public VkDisplayPropertiesKHR.Pointer getVk(){
            return (VkDisplayPropertiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPropertiesKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPropertiesKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPropertiesKHR.Pointer.Array getVk(){
                return (VkDisplayPropertiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPropertiesKHR.Pointer get(int i){
                return new VulkanDisplayPropertiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
