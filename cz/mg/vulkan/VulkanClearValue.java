package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkClearValue.html">khronos documentation</a>
 **/
public class VulkanClearValue extends VulkanObject {
    public VulkanClearValue(){
        super(new VkClearValue());
    }

    public VulkanClearValue(VkClearValue vk){
        super(vk);
    }

    @Override
    public VkClearValue getVk(){
        return (VkClearValue) super.getVk();
    }

    public VulkanClearValue(VulkanClearColorValue color) {
        super(new VkClearValue(color.getVk()));
    }

    public VulkanClearValue(VulkanClearDepthStencilValue depthStencil) {
        super(new VkClearValue(depthStencil.getVk()));
    }


    public VulkanClearColorValue getColor() {
        return new VulkanClearColorValue(getVk().getColor());
    }

    public void setColor(VulkanClearColorValue color) {
        getVk().setColor(color.getVk());
    }

    public VulkanClearDepthStencilValue getDepthStencil() {
        return new VulkanClearDepthStencilValue(getVk().getDepthStencil());
    }

    public void setDepthStencil(VulkanClearDepthStencilValue depthStencil) {
        getVk().setDepthStencil(depthStencil.getVk());
    }


    public static class Array extends VulkanClearValue implements cz.mg.collections.array.ReadonlyArray<VulkanClearValue> {
        public Array(VkClearValue.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkClearValue.Array(count));
        }

        public Array(int count, VulkanClearValue o){
            this(new VkClearValue.Array(count, o.getVk()));
        }

        @Override
        public VkClearValue.Array getVk(){
            return (VkClearValue.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanClearValue get(int i){
            return new VulkanClearValue(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkClearValue.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkClearValue.Pointer());
        }

        public Pointer(long value) {
            this(new VkClearValue.Pointer(value));
        }

        @Override
        public VkClearValue.Pointer getVk(){
            return (VkClearValue.Pointer) super.getVk();
        }

        public static class Array extends VulkanClearValue.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanClearValue.Pointer> {
            public Array(int count) {
                super(new VkClearValue.Pointer.Array(count));
            }

            public Array(VulkanClearValue[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkClearValue.Pointer.Array getVk(){
                return (VkClearValue.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanClearValue.Pointer get(int i){
                return new VulkanClearValue.Pointer(getVk().get(i));
            }
        }
    }
}
