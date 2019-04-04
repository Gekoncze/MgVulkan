package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlaneCapabilitiesKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayPlaneCapabilitiesKHR extends VulkanObject {
    public VulkanDisplayPlaneCapabilitiesKHR(){
        super(new VkDisplayPlaneCapabilitiesKHR());
    }

    public VulkanDisplayPlaneCapabilitiesKHR(VkDisplayPlaneCapabilitiesKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlaneCapabilitiesKHR getVk(){
        return (VkDisplayPlaneCapabilitiesKHR) super.getVk();
    }

    public VulkanDisplayPlaneCapabilitiesKHR(VulkanDisplayPlaneAlphaFlagsKHR supportedAlpha, VulkanOffset2D minSrcPosition, VulkanOffset2D maxSrcPosition, VulkanExtent2D minSrcExtent, VulkanExtent2D maxSrcExtent, VulkanOffset2D minDstPosition, VulkanOffset2D maxDstPosition, VulkanExtent2D minDstExtent, VulkanExtent2D maxDstExtent) {
        super(new VkDisplayPlaneCapabilitiesKHR(supportedAlpha.getVk(), minSrcPosition.getVk(), maxSrcPosition.getVk(), minSrcExtent.getVk(), maxSrcExtent.getVk(), minDstPosition.getVk(), maxDstPosition.getVk(), minDstExtent.getVk(), maxDstExtent.getVk()));
    }

    public VulkanDisplayPlaneAlphaFlagsKHR getSupportedAlpha() {
        return new VulkanDisplayPlaneAlphaFlagsKHR(getVk().getSupportedAlpha());
    }

    public void setSupportedAlpha(VulkanDisplayPlaneAlphaFlagsKHR supportedAlpha) {
        getVk().setSupportedAlpha(supportedAlpha.getVk());
    }

    public VulkanOffset2D getMinSrcPosition() {
        return new VulkanOffset2D(getVk().getMinSrcPosition());
    }

    public void setMinSrcPosition(VulkanOffset2D minSrcPosition) {
        getVk().setMinSrcPosition(minSrcPosition.getVk());
    }

    public VulkanOffset2D getMaxSrcPosition() {
        return new VulkanOffset2D(getVk().getMaxSrcPosition());
    }

    public void setMaxSrcPosition(VulkanOffset2D maxSrcPosition) {
        getVk().setMaxSrcPosition(maxSrcPosition.getVk());
    }

    public VulkanExtent2D getMinSrcExtent() {
        return new VulkanExtent2D(getVk().getMinSrcExtent());
    }

    public void setMinSrcExtent(VulkanExtent2D minSrcExtent) {
        getVk().setMinSrcExtent(minSrcExtent.getVk());
    }

    public VulkanExtent2D getMaxSrcExtent() {
        return new VulkanExtent2D(getVk().getMaxSrcExtent());
    }

    public void setMaxSrcExtent(VulkanExtent2D maxSrcExtent) {
        getVk().setMaxSrcExtent(maxSrcExtent.getVk());
    }

    public VulkanOffset2D getMinDstPosition() {
        return new VulkanOffset2D(getVk().getMinDstPosition());
    }

    public void setMinDstPosition(VulkanOffset2D minDstPosition) {
        getVk().setMinDstPosition(minDstPosition.getVk());
    }

    public VulkanOffset2D getMaxDstPosition() {
        return new VulkanOffset2D(getVk().getMaxDstPosition());
    }

    public void setMaxDstPosition(VulkanOffset2D maxDstPosition) {
        getVk().setMaxDstPosition(maxDstPosition.getVk());
    }

    public VulkanExtent2D getMinDstExtent() {
        return new VulkanExtent2D(getVk().getMinDstExtent());
    }

    public void setMinDstExtent(VulkanExtent2D minDstExtent) {
        getVk().setMinDstExtent(minDstExtent.getVk());
    }

    public VulkanExtent2D getMaxDstExtent() {
        return new VulkanExtent2D(getVk().getMaxDstExtent());
    }

    public void setMaxDstExtent(VulkanExtent2D maxDstExtent) {
        getVk().setMaxDstExtent(maxDstExtent.getVk());
    }


    public static class Array extends VulkanDisplayPlaneCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneCapabilitiesKHR> {
        public Array(VkDisplayPlaneCapabilitiesKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPlaneCapabilitiesKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPlaneCapabilitiesKHR o){
            this(new VkDisplayPlaneCapabilitiesKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPlaneCapabilitiesKHR.Array getVk(){
            return (VkDisplayPlaneCapabilitiesKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPlaneCapabilitiesKHR get(int i){
            return new VulkanDisplayPlaneCapabilitiesKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPlaneCapabilitiesKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPlaneCapabilitiesKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPlaneCapabilitiesKHR.Pointer(value));
        }

        @Override
        public VkDisplayPlaneCapabilitiesKHR.Pointer getVk(){
            return (VkDisplayPlaneCapabilitiesKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPlaneCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneCapabilitiesKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPlaneCapabilitiesKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPlaneCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPlaneCapabilitiesKHR.Pointer.Array getVk(){
                return (VkDisplayPlaneCapabilitiesKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPlaneCapabilitiesKHR.Pointer get(int i){
                return new VulkanDisplayPlaneCapabilitiesKHR.Pointer(getVk().get(i));
            }
        }
    }
}
