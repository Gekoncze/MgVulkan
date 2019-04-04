package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtent3D.html">khronos documentation</a>
 **/
public class VulkanExtent3D extends VulkanObject {
    public VulkanExtent3D(){
        super(new VkExtent3D());
    }

    public VulkanExtent3D(VkExtent3D vk){
        super(vk);
    }

    @Override
    public VkExtent3D getVk(){
        return (VkExtent3D) super.getVk();
    }

    public VulkanExtent3D(VulkanUInt32 width, VulkanUInt32 height, VulkanUInt32 depth) {
        super(new VkExtent3D(width.getVk(), height.getVk(), depth.getVk()));
    }

    public VulkanUInt32 getWidth() {
        return new VulkanUInt32(getVk().getWidth());
    }

    public void setWidth(VulkanUInt32 width) {
        getVk().setWidth(width.getVk());
    }

    public VulkanUInt32 getHeight() {
        return new VulkanUInt32(getVk().getHeight());
    }

    public void setHeight(VulkanUInt32 height) {
        getVk().setHeight(height.getVk());
    }

    public VulkanUInt32 getDepth() {
        return new VulkanUInt32(getVk().getDepth());
    }

    public void setDepth(VulkanUInt32 depth) {
        getVk().setDepth(depth.getVk());
    }


    public static class Array extends VulkanExtent3D implements cz.mg.collections.array.ReadonlyArray<VulkanExtent3D> {
        public Array(VkExtent3D.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExtent3D.Array(count));
        }

        public Array(int count, VulkanExtent3D o){
            this(new VkExtent3D.Array(count, o.getVk()));
        }

        @Override
        public VkExtent3D.Array getVk(){
            return (VkExtent3D.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExtent3D get(int i){
            return new VulkanExtent3D(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExtent3D.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExtent3D.Pointer());
        }

        public Pointer(long value) {
            this(new VkExtent3D.Pointer(value));
        }

        @Override
        public VkExtent3D.Pointer getVk(){
            return (VkExtent3D.Pointer) super.getVk();
        }

        public static class Array extends VulkanExtent3D.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExtent3D.Pointer> {
            public Array(int count) {
                super(new VkExtent3D.Pointer.Array(count));
            }

            public Array(VulkanExtent3D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExtent3D.Pointer.Array getVk(){
                return (VkExtent3D.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExtent3D.Pointer get(int i){
                return new VulkanExtent3D.Pointer(getVk().get(i));
            }
        }
    }
}
