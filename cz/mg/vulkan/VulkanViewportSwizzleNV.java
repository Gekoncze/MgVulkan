package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkViewportSwizzleNV.html">khronos documentation</a>
 **/
public class VulkanViewportSwizzleNV extends VulkanObject {
    public VulkanViewportSwizzleNV(){
        super(new VkViewportSwizzleNV());
    }

    public VulkanViewportSwizzleNV(VkViewportSwizzleNV vk){
        super(vk);
    }

    @Override
    public VkViewportSwizzleNV getVk(){
        return (VkViewportSwizzleNV) super.getVk();
    }

    public VulkanViewportSwizzleNV(VulkanViewportCoordinateSwizzleNV x, VulkanViewportCoordinateSwizzleNV y, VulkanViewportCoordinateSwizzleNV z, VulkanViewportCoordinateSwizzleNV w) {
        super(new VkViewportSwizzleNV(x.getVk(), y.getVk(), z.getVk(), w.getVk()));
    }

    public VulkanViewportCoordinateSwizzleNV getX() {
        return new VulkanViewportCoordinateSwizzleNV(getVk().getX());
    }

    public void setX(VulkanViewportCoordinateSwizzleNV x) {
        getVk().setX(x.getVk());
    }

    public VulkanViewportCoordinateSwizzleNV getY() {
        return new VulkanViewportCoordinateSwizzleNV(getVk().getY());
    }

    public void setY(VulkanViewportCoordinateSwizzleNV y) {
        getVk().setY(y.getVk());
    }

    public VulkanViewportCoordinateSwizzleNV getZ() {
        return new VulkanViewportCoordinateSwizzleNV(getVk().getZ());
    }

    public void setZ(VulkanViewportCoordinateSwizzleNV z) {
        getVk().setZ(z.getVk());
    }

    public VulkanViewportCoordinateSwizzleNV getW() {
        return new VulkanViewportCoordinateSwizzleNV(getVk().getW());
    }

    public void setW(VulkanViewportCoordinateSwizzleNV w) {
        getVk().setW(w.getVk());
    }


    public static class Array extends VulkanViewportSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VulkanViewportSwizzleNV> {
        public Array(VkViewportSwizzleNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkViewportSwizzleNV.Array(count));
        }

        public Array(int count, VulkanViewportSwizzleNV o){
            this(new VkViewportSwizzleNV.Array(count, o.getVk()));
        }

        @Override
        public VkViewportSwizzleNV.Array getVk(){
            return (VkViewportSwizzleNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanViewportSwizzleNV get(int i){
            return new VulkanViewportSwizzleNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkViewportSwizzleNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkViewportSwizzleNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkViewportSwizzleNV.Pointer(value));
        }

        @Override
        public VkViewportSwizzleNV.Pointer getVk(){
            return (VkViewportSwizzleNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanViewportSwizzleNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanViewportSwizzleNV.Pointer> {
            public Array(int count) {
                super(new VkViewportSwizzleNV.Pointer.Array(count));
            }

            public Array(VulkanViewportSwizzleNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkViewportSwizzleNV.Pointer.Array getVk(){
                return (VkViewportSwizzleNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanViewportSwizzleNV.Pointer get(int i){
                return new VulkanViewportSwizzleNV.Pointer(getVk().get(i));
            }
        }
    }
}
