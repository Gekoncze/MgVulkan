package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkClearDepthStencilValue.html">khronos documentation</a>
 **/
public class VulkanClearDepthStencilValue extends VulkanObject {
    public VulkanClearDepthStencilValue(){
        super(new VkClearDepthStencilValue());
    }

    public VulkanClearDepthStencilValue(VkClearDepthStencilValue vk){
        super(vk);
    }

    @Override
    public VkClearDepthStencilValue getVk(){
        return (VkClearDepthStencilValue) super.getVk();
    }

    public VulkanClearDepthStencilValue(VulkanFloat depth, VulkanUInt32 stencil) {
        super(new VkClearDepthStencilValue(depth.getVk(), stencil.getVk()));
    }

    public VulkanFloat getDepth() {
        return new VulkanFloat(getVk().getDepth());
    }

    public void setDepth(VulkanFloat depth) {
        getVk().setDepth(depth.getVk());
    }

    public VulkanUInt32 getStencil() {
        return new VulkanUInt32(getVk().getStencil());
    }

    public void setStencil(VulkanUInt32 stencil) {
        getVk().setStencil(stencil.getVk());
    }


    public static class Array extends VulkanClearDepthStencilValue implements cz.mg.collections.array.ReadonlyArray<VulkanClearDepthStencilValue> {
        public Array(VkClearDepthStencilValue.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkClearDepthStencilValue.Array(count));
        }

        public Array(int count, VulkanClearDepthStencilValue o){
            this(new VkClearDepthStencilValue.Array(count, o.getVk()));
        }

        @Override
        public VkClearDepthStencilValue.Array getVk(){
            return (VkClearDepthStencilValue.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanClearDepthStencilValue get(int i){
            return new VulkanClearDepthStencilValue(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkClearDepthStencilValue.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkClearDepthStencilValue.Pointer());
        }

        public Pointer(long value) {
            this(new VkClearDepthStencilValue.Pointer(value));
        }

        @Override
        public VkClearDepthStencilValue.Pointer getVk(){
            return (VkClearDepthStencilValue.Pointer) super.getVk();
        }

        public static class Array extends VulkanClearDepthStencilValue.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanClearDepthStencilValue.Pointer> {
            public Array(int count) {
                super(new VkClearDepthStencilValue.Pointer.Array(count));
            }

            public Array(VulkanClearDepthStencilValue[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkClearDepthStencilValue.Pointer.Array getVk(){
                return (VkClearDepthStencilValue.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanClearDepthStencilValue.Pointer get(int i){
                return new VulkanClearDepthStencilValue.Pointer(getVk().get(i));
            }
        }
    }
}
