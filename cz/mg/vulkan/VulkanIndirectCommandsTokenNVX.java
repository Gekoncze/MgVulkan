package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanIndirectCommandsTokenNVX extends VulkanObject {
    public VulkanIndirectCommandsTokenNVX(){
        super(new VkIndirectCommandsTokenNVX());
    }

    public VulkanIndirectCommandsTokenNVX(VkIndirectCommandsTokenNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsTokenNVX getVk(){
        return (VkIndirectCommandsTokenNVX) super.getVk();
    }

    public VulkanIndirectCommandsTokenNVX(VulkanIndirectCommandsTokenTypeNVX tokenType, VulkanBuffer buffer, VulkanDeviceSize offset) {
        super(new VkIndirectCommandsTokenNVX(tokenType.getVk(), buffer.getVk(), offset.getVk()));
    }

    public VulkanIndirectCommandsTokenTypeNVX getTokenType() {
        return new VulkanIndirectCommandsTokenTypeNVX(getVk().getTokenType());
    }

    public void setTokenType(VulkanIndirectCommandsTokenTypeNVX tokenType) {
        getVk().setTokenType(tokenType.getVk());
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }

    public VulkanDeviceSize getOffset() {
        return new VulkanDeviceSize(getVk().getOffset());
    }

    public void setOffset(VulkanDeviceSize offset) {
        getVk().setOffset(offset.getVk());
    }


    public static class Array extends VulkanIndirectCommandsTokenNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsTokenNVX> {
        public Array(VkIndirectCommandsTokenNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsTokenNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsTokenNVX o){
            this(new VkIndirectCommandsTokenNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsTokenNVX.Array getVk(){
            return (VkIndirectCommandsTokenNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsTokenNVX get(int i){
            return new VulkanIndirectCommandsTokenNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsTokenNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsTokenNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsTokenNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsTokenNVX.Pointer getVk(){
            return (VkIndirectCommandsTokenNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsTokenNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsTokenNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsTokenNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsTokenNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsTokenNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsTokenNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsTokenNVX.Pointer get(int i){
                return new VulkanIndirectCommandsTokenNVX.Pointer(getVk().get(i));
            }
        }
    }
}
